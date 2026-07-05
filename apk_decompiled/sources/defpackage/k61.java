package defpackage;

import android.opengl.GLES20;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.core.telemetry.SilentException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k61 {
    public final lsc a = mpk.P(Boolean.FALSE);
    public float[] b = new float[7];
    public float[] c = {MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier};
    public long d = System.nanoTime();
    public int e;
    public FloatBuffer f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    public final int a() {
        int iC = c(35633, "attribute vec2 aVertexPosition;\nuniform mat4 uModelViewMatrix;\nvarying vec2 vPosition;\n\nvoid main(void) {\n    // Normalize vertex positions for the fragment shader\n    // This ensures consistent gradients regardless of size\n    vec2 normalizedPosition = aVertexPosition / 2.5;\n    \n    // Use original vertices for positioning\n    gl_Position = uModelViewMatrix * vec4(aVertexPosition, 0.0, 1.0);\n    \n    // Pass normalized position to fragment shader\n    vPosition = normalizedPosition;\n}");
        int iC2 = c(35632, "#define NOISE_ENABLED 1\n#define NOISE_AMOUNT 0.15\n#define NOISE_SCALE 1.0\n\nprecision highp float;\nvarying vec2 vPosition; // Now receiving normalized positions\nuniform vec4 uBaseColor;\nuniform float uTime; // Time for animated noise\nuniform float uOpacityFactor; // Dynamic opacity modifier\nuniform float uOvalRatio; // Dynamic oval shape ratio\n\nfloat random(vec2 st) {\n    return fract(sin(dot(st.xy, vec2(12.9898, 78.233))) * 43758.5453123);\n}\n\nvoid main(void) {\n    // Apply oval effect to normalized coordinates using dynamic ratio\n    vec2 ovalPos = vec2(vPosition.x / uOvalRatio, vPosition.y);\n    \n    // Calculate distance in normalized space\n    float dist = length(ovalPos);\n    \n    // Create a completely smooth falloff without any perceptible edge\n    // Using a combination of exponential and smoothstep for perfect transition\n    float baseAlpha = exp(-dist * dist * 6.0);\n    \n    // Apply smooth transition to zero near the edges\n    float edgeFactor = smoothstep(0.68, 0.48, dist);\n    float alpha = baseAlpha * edgeFactor;\n    \n    // Apply cubic easing for even smoother falloff at the very edge\n    alpha = alpha * alpha * (3.0 - 2.0 * alpha);\n    \n    // Scale down the maximum intensity to prevent oversaturation\n    alpha *= 0.75;\n    \n    // Apply the base color's alpha and dynamic opacity factor\n    alpha *= uBaseColor.a * uOpacityFactor;\n    \n    // Get base color\n    vec3 color = uBaseColor.rgb;\n    \n    // Apply noise if enabled\n    #if NOISE_ENABLED\n        // Base the noise on both screen coordinates and vertex position\n        vec2 noiseCoord = gl_FragCoord.xy * 0.01; // Very coarse screen-space noise\n        \n        // Add vertex position for variation across the gradient\n        noiseCoord += vPosition.xy * 0.2;\n        \n        // Add subtle time variation for animated grain\n        float animSpeed = 24.0; // Film-like flicker\n        float timeScale = floor(uTime * animSpeed) / animSpeed;\n        \n        // Generate multiple layers of noise for film-like grain\n        float noise = 0.0;\n        \n        // Layer 1: Coarse grain with time offset\n        vec2 p1 = floor(noiseCoord * 50.0) + vec2(timeScale * 1.0, timeScale * 0.7);\n        noise += random(p1) * 0.5;\n        \n        // Layer 2: Medium grain with different time offset\n        vec2 p2 = floor(noiseCoord * 150.0) + vec2(timeScale * 0.5, timeScale * 1.3);\n        noise += random(p2) * 0.3;\n        \n        // Layer 3: Fine grain with yet another time offset\n        vec2 p3 = floor(noiseCoord * 300.0) + vec2(timeScale * 1.4, timeScale * 0.2);\n        noise += random(p3) * 0.2;\n        \n        // Film grain approach - sparse bright specks\n        float grainThreshold = 0.75; // Controls sparseness of grain\n        float grainIntensity = NOISE_AMOUNT * 3.0; // Boost grain visibility\n        \n        // Use thresholding to create sparse bright specks\n        float grainMask = smoothstep(grainThreshold, 0.99, noise);\n        vec3 grainColor = vec3(1.0) * grainMask * grainIntensity;\n        \n        // Add the white grain on top of base color\n        color += grainColor;\n        \n        // Add subtle tinting variation to prevent banding\n        vec2 uv = gl_FragCoord.xy;\n        float microVariation = random(uv * 0.001) * 0.02;\n        color += vec3(microVariation);\n    #endif\n    \n    // Properly premultiply the RGB components with alpha\n    vec3 premultColor = color * alpha;\n    \n    // Return premultiplied color (required for gl.ONE, gl.ONE_MINUS_SRC_ALPHA blend mode)\n    gl_FragColor = vec4(premultColor, alpha);\n}");
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            SilentException.a(new SilentException("Bell Viz: Failed to create program"), null, false, 3);
            g();
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, iC);
        GLES20.glAttachShader(iGlCreateProgram, iC2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        SilentException.a(new SilentException("Bell Viz: Could not link program"), null, false, 3);
        GLES20.glDeleteProgram(iGlCreateProgram);
        g();
        return 0;
    }

    public final void b(float f) {
        float f2;
        float f3;
        float f4;
        float fPow;
        for (int i = 0; i < 7; i++) {
            float f5 = i;
            float f6 = ((f5 * 2.0f) / 6.01f) - 1.0f;
            float f7 = 3.1415927f * f5;
            float fSin = (((float) Math.sin((1.3f * f5) + (f * 0.2f))) * 0.01f) + (((float) Math.sin((((f5 * 0.15f) + 0.4f) * f) + (f7 * 0.6f))) * ((0.003f * f5) + 0.04f));
            float fCos = (((float) Math.cos((f5 * 2.7f) + (0.15f * f))) * 0.015f) + (((float) Math.cos((((0.1f * f5) + 0.3f) * f) + (f7 * 0.7f))) * ((0.004f * f5) + 0.07f));
            float[] fArr = this.b;
            if (i < fArr.length) {
                float fMin = Math.min(fArr[i] / 2.0f, 1.0f);
                f4 = (0.9f * fMin) + 0.6f;
                fPow = (((float) Math.pow(fMin, 1.0d)) * 0.65000004f) + 0.2f;
                f2 = fMin * 0.2f;
                f3 = 1.0f - (fMin * 0.25f);
            } else {
                f2 = 0.0f;
                f3 = 1.0f;
                f4 = 1.0f;
                fPow = 1.0f;
            }
            GLES20.glUniform1f(this.l, fPow);
            GLES20.glUniform1f(this.m, f3);
            float[] fArr2 = new float[16];
            Arrays.fill(fArr2, 0, 16, MTTypesetterKt.kLineSkipLimitMultiplier);
            fArr2[0] = f4;
            fArr2[5] = f4;
            fArr2[10] = 1.0f;
            fArr2[12] = fSin + f6;
            fArr2[13] = (fCos - 1.0f) + f2;
            fArr2[15] = 1.0f;
            GLES20.glUniformMatrix4fv(this.j, 1, false, fArr2, 0);
            GLES20.glDrawArrays(4, 0, this.g);
        }
    }

    public final int c(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            SilentException.a(new SilentException(grc.p(i, "Bell Viz: Failed to create shader of type ")), null, false, 3);
            g();
            return 0;
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        SilentException.a(new SilentException(grc.p(i, "Bell Viz: Could not compile shader ")), null, false, 3);
        GLES20.glDeleteShader(iGlCreateShader);
        g();
        return 0;
    }

    public final void d() {
        try {
            float fNanoTime = (System.nanoTime() - this.d) / 1.0E9f;
            GLES20.glClearColor(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
            GLES20.glClear(16384);
            GLES20.glUseProgram(this.e);
            GLES20.glUniform4fv(this.i, 1, this.c, 0);
            GLES20.glUniform1f(this.k, fNanoTime);
            GLES20.glBindBuffer(34962, 0);
            FloatBuffer floatBuffer = this.f;
            if (floatBuffer != null) {
                floatBuffer.position(0);
            }
            GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 0, (Buffer) this.f);
            GLES20.glEnableVertexAttribArray(this.h);
            b(fNanoTime);
        } catch (Exception e) {
            List list = xah.a;
            xah.f(e, "Bell Viz: onDrawFrame Failure", null, null, 28);
            g();
        }
    }

    public final void e(int i, int i2) {
        try {
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glClearColor(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
            GLES20.glClear(16384);
        } catch (Exception e) {
            List list = xah.a;
            xah.f(e, "Bell Viz: onSurfaceChanged Failure", null, null, 28);
            g();
        }
    }

    public final void f() {
        try {
            GLES20.glDisable(2929);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            GLES20.glClearColor(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
            GLES20.glClear(16384);
            int iA = a();
            this.e = iA;
            this.h = GLES20.glGetAttribLocation(iA, "aVertexPosition");
            this.i = GLES20.glGetUniformLocation(this.e, "uBaseColor");
            this.j = GLES20.glGetUniformLocation(this.e, "uModelViewMatrix");
            this.k = GLES20.glGetUniformLocation(this.e, "uTime");
            this.l = GLES20.glGetUniformLocation(this.e, "uOpacityFactor");
            this.m = GLES20.glGetUniformLocation(this.e, "uOvalRatio");
            this.d = System.nanoTime();
            this.g = 6;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(48);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
            floatBufferAsFloatBuffer.put(new float[]{-2.5f, -2.5f, 2.5f, -2.5f, 2.5f, 2.5f, -2.5f, -2.5f, 2.5f, 2.5f, -2.5f, 2.5f});
            floatBufferAsFloatBuffer.position(0);
            this.f = floatBufferAsFloatBuffer;
        } catch (Exception e) {
            List list = xah.a;
            xah.f(e, "Bell Viz: onSurfaceCreated Failure", null, null, 28);
            g();
        }
    }

    public final void g() {
        this.a.setValue(Boolean.TRUE);
    }
}
