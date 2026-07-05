package defpackage;

import androidx.health.platform.client.proto.g;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.gson.JsonParseException;
import io.sentry.android.core.l1;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pmf implements l1, wfg, lig, ia4 {
    public final /* synthetic */ int E;

    public /* synthetic */ pmf(int i) {
        this.E = i;
    }

    public static /* synthetic */ void d() {
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void f(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void g(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    public static /* synthetic */ void h(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void j(String str, Throwable th) {
        throw new JsonParseException(str, th);
    }

    public static /* synthetic */ void k(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void n(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void o(String str) {
        throw new RuntimeException(str);
    }

    @Override // defpackage.lig
    public boolean a() {
        return false;
    }

    public Object b(Object obj, int i, int i2, int i3) {
        switch (this.E) {
            case 7:
                return new d4h((String) obj, i2, i3);
            default:
                return new g4h(a4h.DATADOG, i, (CharSequence) obj, i2, i3);
        }
    }

    public char c(char c) {
        switch (this.E) {
            case 8:
                return c;
            case 9:
                return g4h.c(c);
            default:
                return g4h.b(c);
        }
    }

    @Override // defpackage.wfg
    public zfg get() {
        return zfg.a;
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        switch (this.E) {
            case 14:
                return TransportRegistrar.lambda$getComponents$0(el5Var);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return TransportRegistrar.lambda$getComponents$1(el5Var);
            default:
                return TransportRegistrar.lambda$getComponents$2(el5Var);
        }
    }
}
