package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ts4 extends xzg implements tz7 {
    public ts4() {
        super(5, null);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        i15 i15Var = i15.d;
        return new i15(null, "calendar not available", 2, false);
    }

    @Override // defpackage.tz7
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new ts4(5, (tp4) obj5).invokeSuspend(iei.a);
    }
}
