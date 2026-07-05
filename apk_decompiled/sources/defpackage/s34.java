package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class s34 {
    public int E;
    public Object F;

    public s34(int i) {
        this.E = i;
    }

    public static int e(int i, FileInputStream fileInputStream) throws IOException {
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = fileInputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.e();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = fileInputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.e();
            }
            if ((i5 & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.c();
    }

    public void a(ecj ecjVar) {
    }

    public void b(ecj ecjVar) {
    }

    public abstract bdj c(bdj bdjVar, List list);

    public abstract cbf d(ecj ecjVar, cbf cbfVar);
}
