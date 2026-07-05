package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bph implements q92 {
    public static final bph a = new bph();

    @Override // defpackage.q92
    public final List a() {
        return lm6.E;
    }

    @Override // defpackage.q92
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // defpackage.q92
    public final Object call(Object[] objArr) {
        objArr.getClass();
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // defpackage.q92
    public final Type getReturnType() {
        Class cls = Void.TYPE;
        cls.getClass();
        return cls;
    }
}
