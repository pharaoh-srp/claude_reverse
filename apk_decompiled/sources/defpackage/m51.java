package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public interface m51 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean c();

    boolean d();

    ByteBuffer e();

    void f(j51 j51Var);

    void g(ByteBuffer byteBuffer);

    i51 h(i51 i51Var);

    void i();

    default long j(long j) {
        return j;
    }

    void reset();
}
