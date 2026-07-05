package defpackage;

import com.google.gson.JsonParseException;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ah5 implements s16 {
    public final h99 E;

    public ah5(h99 h99Var, int i) {
        h99Var.getClass();
        switch (i) {
            case 1:
                this.E = h99Var;
                break;
            default:
                this.E = h99Var;
                break;
        }
    }

    public File a(File file, String str, String str2) {
        file.getClass();
        str.getClass();
        str2.getClass();
        File file2 = new File(new File(file, String.format(Locale.US, "datastore_v%s", Arrays.copyOf(new Object[]{0}, 1))), str);
        h99 h99Var = this.E;
        if (!fd9.T(file2, h99Var)) {
            fd9.l0(file2, h99Var);
        }
        return new File(file2, str2);
    }

    @Override // defpackage.s16
    public Object r(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        if (bArr.length == 0) {
            return null;
        }
        try {
            return fd9.W(new String(bArr, dj2.a), this.E);
        } catch (JsonParseException e) {
            dch.H(this.E, 5, g99.E, uxe.H, e, false, 48);
            return null;
        }
    }
}
