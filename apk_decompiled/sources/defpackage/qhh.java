package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class qhh implements aaf {
    public final /* synthetic */ aaf a;
    public final wz5 b;
    public final wz5 c;

    public qhh(aaf aafVar, final rhh rhhVar) {
        this.a = aafVar;
        final int i = 0;
        this.b = mpk.w(new zy7() { // from class: phh
            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                rhh rhhVar2 = rhhVar;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(rhhVar2.a.h() < rhhVar2.b.h());
                    default:
                        return Boolean.valueOf(rhhVar2.a.h() > MTTypesetterKt.kLineSkipLimitMultiplier);
                }
            }
        });
        final int i2 = 1;
        this.c = mpk.w(new zy7() { // from class: phh
            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                rhh rhhVar2 = rhhVar;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(rhhVar2.a.h() < rhhVar2.b.h());
                    default:
                        return Boolean.valueOf(rhhVar2.a.h() > MTTypesetterKt.kLineSkipLimitMultiplier);
                }
            }
        });
    }

    @Override // defpackage.aaf
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.aaf
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.aaf
    public final Object c(zwb zwbVar, pz7 pz7Var, tp4 tp4Var) {
        return this.a.c(zwbVar, pz7Var, tp4Var);
    }

    @Override // defpackage.aaf
    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.aaf
    public final float e(float f) {
        return this.a.e(f);
    }
}
