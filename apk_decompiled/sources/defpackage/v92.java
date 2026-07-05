package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class v92 extends w92 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v92(Field field, boolean z, int i) {
        super(field, z);
        this.e = i;
    }

    @Override // defpackage.fa2
    public void c(Object[] objArr) {
        switch (this.e) {
            case 1:
                objArr.getClass();
                tvj.b(this, objArr);
                d(mp0.E0(objArr));
                break;
            default:
                super.c(objArr);
                break;
        }
    }
}
