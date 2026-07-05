package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class m5 extends k5 {
    public static m5 e;
    public static final lne f = lne.F;
    public static final lne g = lne.E;
    public yjh c;
    public wjf d;

    @Override // defpackage.k5
    public final int[] g(int i) {
        int iE;
        if (l().length() > 0 && i < l().length()) {
            try {
                wjf wjfVar = this.d;
                if (wjfVar == null) {
                    x44.o0("node");
                    throw null;
                }
                l9e l9eVarG = wjfVar.g();
                int iRound = Math.round(l9eVarG.d - l9eVarG.b);
                if (i <= 0) {
                    i = 0;
                }
                yjh yjhVar = this.c;
                if (yjhVar == null) {
                    x44.o0("layoutResult");
                    throw null;
                }
                int iD = yjhVar.b.d(i);
                yjh yjhVar2 = this.c;
                if (yjhVar2 == null) {
                    x44.o0("layoutResult");
                    throw null;
                }
                float f2 = yjhVar2.b.f(iD) + iRound;
                yjh yjhVar3 = this.c;
                if (yjhVar3 == null) {
                    x44.o0("layoutResult");
                    throw null;
                }
                float f3 = yjhVar3.b.f(r0.f - 1);
                yjh yjhVar4 = this.c;
                if (f2 < f3) {
                    if (yjhVar4 == null) {
                        x44.o0("layoutResult");
                        throw null;
                    }
                    iE = yjhVar4.b.e(f2);
                } else {
                    if (yjhVar4 == null) {
                        x44.o0("layoutResult");
                        throw null;
                    }
                    iE = yjhVar4.b.f;
                }
                return k(i, t(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.k5
    public final int[] r(int i) {
        int iE;
        if (l().length() > 0 && i > 0) {
            try {
                wjf wjfVar = this.d;
                if (wjfVar == null) {
                    x44.o0("node");
                    throw null;
                }
                l9e l9eVarG = wjfVar.g();
                int iRound = Math.round(l9eVarG.d - l9eVarG.b);
                int length = l().length();
                if (length <= i) {
                    i = length;
                }
                yjh yjhVar = this.c;
                if (yjhVar == null) {
                    x44.o0("layoutResult");
                    throw null;
                }
                int iD = yjhVar.b.d(i);
                yjh yjhVar2 = this.c;
                if (yjhVar2 == null) {
                    x44.o0("layoutResult");
                    throw null;
                }
                float f2 = yjhVar2.b.f(iD) - iRound;
                if (f2 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                    yjh yjhVar3 = this.c;
                    if (yjhVar3 == null) {
                        x44.o0("layoutResult");
                        throw null;
                    }
                    iE = yjhVar3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == l().length() && iE < iD) {
                    iE++;
                }
                return k(t(iE, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int t(int i, lne lneVar) {
        yjh yjhVar = this.c;
        if (yjhVar == null) {
            x44.o0("layoutResult");
            throw null;
        }
        int iH = yjhVar.h(i);
        yjh yjhVar2 = this.c;
        if (yjhVar2 == null) {
            x44.o0("layoutResult");
            throw null;
        }
        lne lneVarI = yjhVar2.i(iH);
        yjh yjhVar3 = this.c;
        if (lneVar != lneVarI) {
            if (yjhVar3 != null) {
                return yjhVar3.h(i);
            }
            x44.o0("layoutResult");
            throw null;
        }
        if (yjhVar3 != null) {
            return yjhVar3.b.c(i, false) - 1;
        }
        x44.o0("layoutResult");
        throw null;
    }

    public final void u(String str, yjh yjhVar, wjf wjfVar) {
        this.a = str;
        this.c = yjhVar;
        this.d = wjfVar;
    }
}
