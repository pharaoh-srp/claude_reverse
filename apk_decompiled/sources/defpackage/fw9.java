package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class fw9 {
    public static final fw9 b = new fw9(0);
    public static final fw9 c = new fw9(1);
    public final /* synthetic */ int a;

    public /* synthetic */ fw9(int i) {
        this.a = i;
    }

    public final Object a(final Context context, final String str) {
        int i = this.a;
        lm6 lm6Var = lm6.E;
        switch (i) {
            case 0:
                aw9 aw9Var = aw9.E;
                final int i2 = 0;
                zy7 zy7Var = new zy7() { // from class: ew9
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i3 = i2;
                        String str2 = str;
                        Context context2 = context;
                        switch (i3) {
                            case 0:
                                return tvk.c(context2, str2);
                            default:
                                return xvj.k(context2, str2);
                        }
                    }
                };
                ft5 ft5Var = g86.a;
                vr5 vr5Var = vr5.G;
                myg mygVarG = iuj.g();
                vr5Var.getClass();
                mp4 mp4VarC = fd9.c(nai.Z(vr5Var, mygVarG));
                kj7 kj7Var = new kj7(aw9Var, zy7Var);
                c45 c45VarR0 = mp4VarC.E;
                if (c45VarR0.x0(dd8.J) == null) {
                    c45VarR0 = c45VarR0.r0(knk.g());
                }
                c45VarR0.getClass();
                return new bi5(kj7Var, x44.W(new dx(w44.a1(lm6Var, lm6Var), (tp4) null, 19)), new a5(26), c45VarR0);
            default:
                final int i3 = 1;
                zy7 zy7Var2 = new zy7() { // from class: ew9
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i32 = i3;
                        String str2 = str;
                        Context context2 = context;
                        switch (i32) {
                            case 0:
                                return tvk.c(context2, str2);
                            default:
                                return xvj.k(context2, str2);
                        }
                    }
                };
                ft5 ft5Var2 = g86.a;
                vr5 vr5Var2 = vr5.G;
                myg mygVarG2 = iuj.g();
                vr5Var2.getClass();
                return yb5.m(lm6Var, fd9.c(nai.Z(vr5Var2, mygVarG2)), zy7Var2);
        }
    }
}
