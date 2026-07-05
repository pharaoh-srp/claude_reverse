package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    public Object deserialize(Decoder decoder) {
        decoder.getClass();
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        decoder.getClass();
        Object objA = a();
        int iB = b(objA);
        ud4 ud4VarC = decoder.c(getDescriptor());
        while (true) {
            int iX = ud4VarC.x(getDescriptor());
            if (iX == -1) {
                ud4VarC.b(getDescriptor());
                return h(objA);
            }
            f(ud4VarC, iX + iB, objA);
        }
    }

    public abstract void f(ud4 ud4Var, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
