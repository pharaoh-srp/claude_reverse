package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class pq9 implements lf {
    public static final byte[] c = new byte[0];
    public final fp9 a;
    public final bh b;

    public pq9(fp9 fp9Var, bh bhVar) {
        this.a = fp9Var;
        this.b = bhVar;
    }

    @Override // defpackage.lf
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        a aVarH;
        fp9 fp9Var = this.a;
        AtomicReference atomicReference = tde.a;
        synchronized (tde.class) {
            try {
                yf yfVar = ((zo9) tde.a.get()).a(fp9Var.B()).a;
                Class cls = yfVar.c;
                if (!yfVar.b.keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + yfVar.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) tde.c.get(fp9Var.B())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + fp9Var.B());
                }
                k22 k22VarC = fp9Var.C();
                try {
                    t3 t3VarG = yfVar.g();
                    a aVarM = t3VarG.m(k22VarC);
                    t3VarG.o(aVarM);
                    aVarH = t3VarG.h(aVarM);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) yfVar.g().F).getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrE = aVarH.e();
        byte[] bArrA = this.b.a(bArrE, c);
        byte[] bArrA2 = ((lf) tde.d(this.a.B(), bArrE)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // defpackage.lf
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((lf) tde.d(this.a.B(), this.b.b(bArr3, c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
