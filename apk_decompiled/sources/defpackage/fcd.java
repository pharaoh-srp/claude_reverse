package defpackage;

import androidx.datastore.preferences.protobuf.f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class fcd extends f {
    private static final fcd DEFAULT_INSTANCE;
    private static volatile ytc PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private q89 strings_ = xud.g();

    static {
        fcd fcdVar = new fcd();
        DEFAULT_INSTANCE = fcdVar;
        f.j(fcd.class, fcdVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void n(fcd fcdVar, Iterable iterable) {
        s3 s3Var = (s3) fcdVar.strings_;
        if (!s3Var.b()) {
            xud xudVar = (xud) s3Var;
            fcdVar.strings_ = xudVar.l(xudVar.size() * 2);
        }
        q89 q89Var = fcdVar.strings_;
        Charset charset = w89.a;
        if (iterable instanceof u1a) {
            List listC = ((u1a) iterable).c();
            ij0.x(q89Var);
            q89Var.size();
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof i22) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                i22.e(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof ofd) {
            q89Var.addAll((Collection<? extends E>) ((Collection) iterable));
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (q89Var instanceof ArrayList) {
                ((ArrayList) q89Var).ensureCapacity(q89Var.size() + size);
            } else if (q89Var instanceof xud) {
                xud xudVar2 = (xud) q89Var;
                xudVar2.h(xudVar2.size() + size);
            }
        }
        int size2 = q89Var.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    j28.d(size2, q89Var);
                    throw null;
                }
                q89Var.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size3 = list.size();
        for (int i = 0; i < size3; i++) {
            Object obj2 = list.get(i);
            if (obj2 == null) {
                j28.d(size2, q89Var);
                throw null;
            }
            q89Var.add(obj2);
        }
    }

    public static fcd o() {
        return DEFAULT_INSTANCE;
    }

    public static ecd q() {
        return (ecd) ((j28) DEFAULT_INSTANCE.b(5));
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final Object b(int i) {
        ytc o28Var;
        int iF = sq6.F(i);
        if (iF == 0) {
            return (byte) 1;
        }
        if (iF == 2) {
            return new g2e(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
        }
        if (iF == 3) {
            return new fcd();
        }
        if (iF == 4) {
            return new ecd();
        }
        if (iF == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iF != 6) {
            throw null;
        }
        ytc ytcVar = PARSER;
        if (ytcVar != null) {
            return ytcVar;
        }
        synchronized (fcd.class) {
            try {
                o28Var = PARSER;
                if (o28Var == null) {
                    o28Var = new o28();
                    PARSER = o28Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o28Var;
    }

    public final q89 p() {
        return this.strings_;
    }
}
