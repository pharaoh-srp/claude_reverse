package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class l5 extends k5 {
    public static l5 e;
    public static l5 f;
    public static l5 g;
    public static final lne h = lne.F;
    public static final lne i = lne.E;
    public final /* synthetic */ int c;
    public Object d;

    public /* synthetic */ l5(int i2) {
        this.c = i2;
    }

    @Override // defpackage.k5
    public final int[] g(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = l().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        x44.o0("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            x44.o0("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return k(i2, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        x44.o0("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (l().length() <= 0 || i2 >= l().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!w(i2) && (!w(i2) || (i2 != 0 && w(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        x44.o0("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    x44.o0("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !v(iFollowing2)) {
                    return null;
                }
                return k(i2, iFollowing2);
            default:
                if (l().length() <= 0 || i2 >= l().length()) {
                    return null;
                }
                yjh yjhVar = (yjh) this.d;
                lne lneVar = h;
                if (i2 < 0) {
                    if (yjhVar == null) {
                        x44.o0("layoutResult");
                        throw null;
                    }
                    iD = yjhVar.b.d(0);
                } else {
                    if (yjhVar == null) {
                        x44.o0("layoutResult");
                        throw null;
                    }
                    int iD2 = yjhVar.b.d(i2);
                    iD = t(iD2, lneVar) == i2 ? iD2 : iD2 + 1;
                }
                yjh yjhVar2 = (yjh) this.d;
                if (yjhVar2 == null) {
                    x44.o0("layoutResult");
                    throw null;
                }
                if (iD >= yjhVar2.b.f) {
                    return null;
                }
                return k(t(iD, lneVar), t(iD, i) + 1);
        }
    }

    @Override // defpackage.k5
    public void n(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    x44.o0("impl");
                    throw null;
                }
            case 1:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    x44.o0("impl");
                    throw null;
                }
            default:
                super.n(str);
                return;
        }
    }

    @Override // defpackage.k5
    public final int[] r(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = l().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        x44.o0("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            x44.o0("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return k(iPreceding, i2);
                    }
                    if (breakIterator2 == null) {
                        x44.o0("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = l().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !w(i2 - 1) && !v(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        x44.o0("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    x44.o0("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !w(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !w(iPreceding2 - 1)) {
                    return k(iPreceding2, i2);
                }
                return null;
            default:
                if (l().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = l().length();
                yjh yjhVar = (yjh) this.d;
                lne lneVar = i;
                if (i2 > length3) {
                    if (yjhVar == null) {
                        x44.o0("layoutResult");
                        throw null;
                    }
                    iD = yjhVar.b.d(l().length());
                } else {
                    if (yjhVar == null) {
                        x44.o0("layoutResult");
                        throw null;
                    }
                    int iD2 = yjhVar.b.d(i2);
                    iD = t(iD2, lneVar) + 1 == i2 ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return k(t(iD, h), t(iD, lneVar) + 1);
        }
    }

    public int t(int i2, lne lneVar) {
        yjh yjhVar = (yjh) this.d;
        if (yjhVar == null) {
            x44.o0("layoutResult");
            throw null;
        }
        int iH = yjhVar.h(i2);
        yjh yjhVar2 = (yjh) this.d;
        if (yjhVar2 == null) {
            x44.o0("layoutResult");
            throw null;
        }
        lne lneVarI = yjhVar2.i(iH);
        yjh yjhVar3 = (yjh) this.d;
        if (lneVar != lneVarI) {
            if (yjhVar3 != null) {
                return yjhVar3.h(i2);
            }
            x44.o0("layoutResult");
            throw null;
        }
        if (yjhVar3 != null) {
            return yjhVar3.b.c(i2, false) - 1;
        }
        x44.o0("layoutResult");
        throw null;
    }

    public void u(String str, yjh yjhVar) {
        this.a = str;
        this.d = yjhVar;
    }

    public boolean v(int i2) {
        if (i2 <= 0 || !w(i2 - 1)) {
            return false;
        }
        return i2 == l().length() || !w(i2);
    }

    public boolean w(int i2) {
        if (i2 < 0 || i2 >= l().length()) {
            return false;
        }
        return Character.isLetterOrDigit(l().codePointAt(i2));
    }
}
