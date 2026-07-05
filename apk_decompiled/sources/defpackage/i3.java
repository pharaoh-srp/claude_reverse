package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes.dex */
public abstract class i3 {
    static {
        int i = oc7.b;
    }

    public final b3 a(ByteArrayInputStream byteArrayInputStream, oc7 oc7Var) throws InvalidProtocolBufferException {
        b3 b3Var;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                b3Var = null;
            } else {
                if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 >= 32) {
                            while (i2 < 64) {
                                int i3 = byteArrayInputStream.read();
                                if (i3 == -1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                if ((i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                                    i2 += 7;
                                }
                            }
                            throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                        }
                        int i4 = byteArrayInputStream.read();
                        if (i4 == -1) {
                            throw InvalidProtocolBufferException.a();
                        }
                        i |= (i4 & 127) << i2;
                        if ((i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
                            break;
                        }
                        i2 += 7;
                    }
                }
                t34 t34Var = new t34(new z2(byteArrayInputStream, i));
                b3Var = (b3) b(t34Var, oc7Var);
                try {
                    t34Var.a(0);
                } catch (InvalidProtocolBufferException e) {
                    e.E = b3Var;
                    throw e;
                }
            }
            if (b3Var == null || b3Var.b()) {
                return b3Var;
            }
            InvalidProtocolBufferException invalidProtocolBufferExceptionA = new UninitializedMessageException().a();
            invalidProtocolBufferExceptionA.E = b3Var;
            throw invalidProtocolBufferExceptionA;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }

    public abstract Object b(t34 t34Var, oc7 oc7Var);
}
