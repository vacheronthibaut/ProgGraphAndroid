package com.example.dames;

import android.content.Context;
import android.graphics.Shader;
import android.opengl.GLES31;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;


public class MyGLRenderer implements GLSurfaceView.Renderer {

    private final Context mContext;

    Pion mPion;
    Camera mCamera;

    MyGLRenderer(final Context context){
        mContext = context;
    }

    @Override
    public void onSurfaceCreated(GL10 unused, EGLConfig config) {



        int vertHandler = ShaderHelper.compileShader(GLES31.GL_VERTEX_SHADER, RawRessourceReader.readTextFileFromRawResource(mContext, R.raw.pionvertexshader));
        int fragHandler = ShaderHelper.compileShader(GLES31.GL_FRAGMENT_SHADER, RawRessourceReader.readTextFileFromRawResource(mContext,R.raw.pionfragmentshader));
        int program = ShaderHelper.createAndLinkProgram(vertHandler, fragHandler, null);

        mPion = new Pion(20, program);
        mPion.setCouleur(new float[]{ 0.2f, 0.709803922f, 0.898039216f});

        mCamera = new Camera();

        GLES31.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public void onDrawFrame(GL10 unused) {
        GLES31.glClear(GLES31.GL_COLOR_BUFFER_BIT);
        mPion.draw(mCamera.getMVPMatrix());
    }


    public void onSurfaceChanged(GL10 unused, int width, int height) {
        GLES31.glViewport(0, 0, width, height);
        mCamera.surfaceChanged(width, height);
    }


}