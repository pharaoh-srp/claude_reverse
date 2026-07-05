package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class nd5 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public nd5(jje jjeVar) {
        this.e = jjeVar.b;
        this.f = jjeVar.c;
        this.g = jjeVar.a.c;
        this.h = jjeVar.o;
        this.i = jjeVar.s;
        this.j = jjeVar.t;
        this.k = jjeVar.u;
        this.a = jjeVar.p;
        this.b = jjeVar.q;
        this.c = jjeVar.r;
        this.l = jjeVar.w;
        this.d = jjeVar.x;
    }

    public CursorAnchorInfo a() {
        cu9 cu9Var;
        cu9 cu9VarB;
        yjh yjhVarC;
        Matrix matrix = (Matrix) this.l;
        float[] fArr = (float[]) this.k;
        akh akhVar = (akh) this.f;
        cu9 cu9VarE = akhVar.e();
        if (cu9VarE != null) {
            if (!cu9VarE.n()) {
                cu9VarE = null;
            }
            if (cu9VarE != null && (cu9Var = (cu9) akhVar.d.getValue()) != null) {
                if (!cu9Var.n()) {
                    cu9Var = null;
                }
                if (cu9Var != null && (cu9VarB = akhVar.b()) != null) {
                    if (!cu9VarB.n()) {
                        cu9VarB = null;
                    }
                    if (cu9VarB != null && (yjhVarC = akhVar.c()) != null) {
                        efh efhVarD = ((i5i) this.e).d();
                        nwa.d(fArr);
                        cu9VarE.h(fArr);
                        csg.M(matrix, fArr);
                        l9e l9eVarM = u00.R(cu9Var).m(cu9VarE.G(cu9Var, 0L));
                        l9e l9eVarM2 = u00.R(cu9VarB).m(cu9VarE.G(cu9VarB, 0L));
                        CursorAnchorInfo.Builder builder = (CursorAnchorInfo.Builder) this.j;
                        long j = efhVarD.H;
                        kkh kkhVar = efhVarD.I;
                        boolean z = this.a;
                        boolean z2 = this.b;
                        boolean z3 = this.c;
                        boolean z4 = this.d;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int iG = kkh.g(j);
                        builder.setSelectionRange(iG, kkh.f(j));
                        lne lneVar = lne.F;
                        if (z && iG >= 0) {
                            l9e l9eVarC = yjhVarC.c(iG);
                            float fD0 = wd6.d0(l9eVarC.a, MTTypesetterKt.kLineSkipLimitMultiplier, (int) (yjhVarC.c >> 32));
                            boolean zS = gb9.s(l9eVarM, fD0, l9eVarC.b);
                            boolean zS2 = gb9.s(l9eVarM, fD0, l9eVarC.d);
                            boolean z5 = yjhVarC.a(iG) == lneVar;
                            int i = (zS || zS2) ? 1 : 0;
                            if (!zS || !zS2) {
                                i |= 2;
                            }
                            if (z5) {
                                i |= 4;
                            }
                            float f = l9eVarC.b;
                            float f2 = l9eVarC.d;
                            builder.setInsertionMarkerLocation(fD0, f, f2, f2, i);
                        }
                        if (z2) {
                            int iG2 = kkhVar != null ? kkh.g(kkhVar.a) : -1;
                            int iF = kkhVar != null ? kkh.f(kkhVar.a) : -1;
                            if (iG2 >= 0 && iG2 < iF) {
                                builder.setComposingText(iG2, efhVarD.G.subSequence(iG2, iF));
                                float[] fArr2 = new float[(iF - iG2) * 4];
                                yjhVarC.b.a(mwa.m(iG2, iF), fArr2);
                                int i2 = iG2;
                                while (iG2 < iF) {
                                    int i3 = (iG2 - i2) * 4;
                                    float f3 = fArr2[i3];
                                    float f4 = fArr2[i3 + 1];
                                    float f5 = fArr2[i3 + 2];
                                    float f6 = fArr2[i3 + 3];
                                    boolean z6 = z4;
                                    int i4 = (f3 < l9eVarM.c ? 1 : 0) & (l9eVarM.a < f5 ? 1 : 0) & (l9eVarM.b < f6 ? 1 : 0) & (f4 < l9eVarM.d ? 1 : 0);
                                    if (!gb9.s(l9eVarM, f3, f4) || !gb9.s(l9eVarM, f5, f6)) {
                                        i4 |= 2;
                                    }
                                    if (yjhVarC.a(iG2) == lneVar) {
                                        i4 |= 4;
                                    }
                                    builder.addCharacterBounds(iG2, f3, f4, f5, f6, i4);
                                    iG2++;
                                    z4 = z6;
                                }
                            }
                        }
                        boolean z7 = z4;
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 33 && z3) {
                            builder.setEditorBoundsInfo(z5.k().setEditorBounds(mwa.R(l9eVarM2)).setHandwritingBounds(mwa.R(l9eVarM2)).build());
                        }
                        if (i5 >= 34 && z7) {
                            kxk.j(builder, yjhVarC, l9eVarM);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }

    public nd5(i5i i5iVar, akh akhVar, eb1 eb1Var, l45 l45Var) {
        this.e = i5iVar;
        this.f = akhVar;
        this.g = eb1Var;
        this.h = l45Var;
        this.j = new CursorAnchorInfo.Builder();
        this.k = nwa.a();
        this.l = new Matrix();
    }
}
