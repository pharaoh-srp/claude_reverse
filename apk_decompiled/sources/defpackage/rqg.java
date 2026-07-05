package defpackage;

import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.configs.flags.StreamSmoothingConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rqg {
    public static final boolean a;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    static {
        /*
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "ranchu"
            boolean r1 = defpackage.x44.r(r0, r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L31
            java.lang.String r1 = "goldfish"
            boolean r0 = defpackage.x44.r(r0, r1)
            if (r0 != 0) goto L31
            java.lang.String r0 = android.os.Build.PRODUCT
            r0.getClass()
            java.lang.String r1 = "sdk_"
            boolean r0 = defpackage.isg.q0(r0, r1, r3)
            if (r0 != 0) goto L31
            java.lang.String r0 = android.os.Build.FINGERPRINT
            r0.getClass()
            java.lang.String r1 = "generic"
            boolean r0 = defpackage.bsg.u0(r0, r1, r3)
            if (r0 == 0) goto L2f
            goto L31
        L2f:
            r0 = r3
            goto L32
        L31:
            r0 = r2
        L32:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r1 < r4) goto L3b
            if (r0 != 0) goto L3b
            goto L3c
        L3b:
            r2 = r3
        L3c:
            defpackage.rqg.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqg.<clinit>():void");
    }

    public static final void a(final boolean z, final StreamSmoothingConfig streamSmoothingConfig, final ta4 ta4Var, ld4 ld4Var, final int i) {
        boolean z2;
        StreamSmoothingConfig streamSmoothingConfig2;
        ta4 ta4Var2;
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1787217037);
        int i3 = (e18Var.g(z) ? 4 : 2) | i | (e18Var.f(streamSmoothingConfig) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = (i3 & 112) == 32;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z3 || objN == lz1Var) {
                objN = null;
                if (streamSmoothingConfig != null && a && streamSmoothingConfig.getFade_in_tail_chars() > 0) {
                    int fade_in_tail_chars = streamSmoothingConfig.getFade_in_tail_chars();
                    int fade_in_duration_ms = streamSmoothingConfig.getFade_in_duration_ms();
                    long fade_in_settle_delay_ms = streamSmoothingConfig.getFade_in_settle_delay_ms();
                    qqg qqgVar = qqg.E;
                    objN = new nqg(fade_in_tail_chars, fade_in_duration_ms, fade_in_settle_delay_ms);
                }
                e18Var.k0(objN);
            }
            nqg nqgVar = (nqg) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = Boolean.valueOf(z);
                e18Var.k0(objN2);
            }
            boolean zBooleanValue = ((Boolean) objN2).booleanValue();
            if (nqgVar == null || !zBooleanValue) {
                e18Var.a0(-1726358707);
                ta4Var.invoke(e18Var, 6);
                e18Var.p(false);
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i4 = 0;
                    r7eVarS.d = new pz7(z, streamSmoothingConfig, ta4Var, i, i4) { // from class: pqg
                        public final /* synthetic */ int E;
                        public final /* synthetic */ boolean F;
                        public final /* synthetic */ StreamSmoothingConfig G;
                        public final /* synthetic */ ta4 H;

                        {
                            this.E = i4;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.E;
                            iei ieiVar = iei.a;
                            ta4 ta4Var3 = this.H;
                            StreamSmoothingConfig streamSmoothingConfig3 = this.G;
                            boolean z4 = this.F;
                            ld4 ld4Var2 = (ld4) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    rqg.a(z4, streamSmoothingConfig3, ta4Var3, ld4Var2, x44.p0(385));
                                    break;
                                default:
                                    rqg.a(z4, streamSmoothingConfig3, ta4Var3, ld4Var2, x44.p0(385));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    return;
                }
                return;
            }
            e18Var.a0(-1726320267);
            e18Var.p(false);
            j8.c(oqg.a.a(nqgVar), ta4Var, e18Var, 56);
            z2 = z;
            streamSmoothingConfig2 = streamSmoothingConfig;
            ta4Var2 = ta4Var;
            i2 = i;
        } else {
            z2 = z;
            streamSmoothingConfig2 = streamSmoothingConfig;
            ta4Var2 = ta4Var;
            i2 = i;
            e18Var.T();
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            final int i5 = i2;
            final ta4 ta4Var3 = ta4Var2;
            final StreamSmoothingConfig streamSmoothingConfig3 = streamSmoothingConfig2;
            final boolean z4 = z2;
            final int i6 = 1;
            r7eVarS2.d = new pz7(z4, streamSmoothingConfig3, ta4Var3, i5, i6) { // from class: pqg
                public final /* synthetic */ int E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ StreamSmoothingConfig G;
                public final /* synthetic */ ta4 H;

                {
                    this.E = i6;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.E;
                    iei ieiVar = iei.a;
                    ta4 ta4Var32 = this.H;
                    StreamSmoothingConfig streamSmoothingConfig32 = this.G;
                    boolean z42 = this.F;
                    ld4 ld4Var2 = (ld4) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            rqg.a(z42, streamSmoothingConfig32, ta4Var32, ld4Var2, x44.p0(385));
                            break;
                        default:
                            rqg.a(z42, streamSmoothingConfig32, ta4Var32, ld4Var2, x44.p0(385));
                            break;
                    }
                    return ieiVar;
                }
            };
        }
    }

    public static final i50 b(float f, List list) {
        ComposeShader composeShader;
        if (f > MTTypesetterKt.kLineSkipLimitMultiplier) {
            Iterator it = list.iterator();
            ComposeShader composeShader2 = null;
            while (it.hasNext()) {
                i4h i4hVar = (i4h) it.next();
                float f2 = i4hVar.b;
                float f3 = i4hVar.c;
                float f4 = i4hVar.d;
                if (f2 != i4hVar.a && f4 > f3) {
                    float f5 = i4hVar.a;
                    float f6 = i4hVar.b;
                    int iArgb = Color.argb((int) (wd6.d0(i4hVar.e * f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f) * 255.0f), 0, 0, 0);
                    int iArgb2 = Color.argb((int) (wd6.d0(i4hVar.f * f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f) * 255.0f), 0, 0, 0);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    float f7 = 1.0f / (f4 - f3);
                    composeShader = new ComposeShader(new LinearGradient(f5, MTTypesetterKt.kLineSkipLimitMultiplier, f6, MTTypesetterKt.kLineSkipLimitMultiplier, iArgb, iArgb2, tileMode), new LinearGradient(MTTypesetterKt.kLineSkipLimitMultiplier, i4hVar.c, MTTypesetterKt.kLineSkipLimitMultiplier, i4hVar.d, new int[]{0, -16777216, -16777216, 0}, new float[]{MTTypesetterKt.kLineSkipLimitMultiplier, f7, 1.0f - f7, 1.0f}, tileMode), BlendMode.SRC_IN);
                } else {
                    composeShader = null;
                }
                if (composeShader != null) {
                    composeShader2 = composeShader2 == null ? composeShader : new ComposeShader(composeShader2, composeShader, BlendMode.LIGHTEN);
                }
            }
            if (composeShader2 != null) {
                RenderEffect renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
                renderEffectCreateOffsetEffect.getClass();
                RenderEffect renderEffectCreateShaderEffect = RenderEffect.createShaderEffect(composeShader2);
                BlendMode blendMode = BlendMode.DST_OUT;
                RenderEffect renderEffectCreateBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffectCreateOffsetEffect, renderEffectCreateShaderEffect, BlendMode.DST_OUT);
                renderEffectCreateBlendModeEffect.getClass();
                return new i50(renderEffectCreateBlendModeEffect);
            }
        }
        return null;
    }
}
