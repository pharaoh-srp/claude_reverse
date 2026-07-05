package defpackage;

import com.google.android.gms.internal.fido.zzho;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xlk implements Comparable {
    public static int d(byte b) {
        return (b >> 5) & 7;
    }

    public static xlk e(byte... bArr) {
        bArr.getClass();
        hmk hmkVar = new hmk(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return prk.n(hmkVar);
        } finally {
            try {
                hmkVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final xlk c(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (xlk) cls.cast(this);
        }
        throw new zzho(ij0.k("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
