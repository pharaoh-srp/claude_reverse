package defpackage;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mt5 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ mt5(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                return (uyi) ((h4) serializable).invoke(obj);
            default:
                return ((Class) serializable).cast((c5c) obj);
        }
    }
}
