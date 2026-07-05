package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class z92 extends aa2 {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z92(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.g = i;
    }

    @Override // defpackage.aa2, defpackage.fa2
    public void c(Object[] objArr) {
        switch (this.g) {
            case 1:
                objArr.getClass();
                super.c(objArr);
                d(mp0.E0(objArr));
                break;
            default:
                super.c(objArr);
                break;
        }
    }
}
