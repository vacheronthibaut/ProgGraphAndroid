precision mediump float;
uniform vec3 vColor;
varying vec4 normale;
void main() {
    float cosTheta = clamp (dot(normalize(normale.xyz),normalize(vec3(0,1,0))),0.0,1.0);
    gl_FragColor = vec4(vColor, 1.0f) + vec4(1,0,0,1) * cosTheta;
}