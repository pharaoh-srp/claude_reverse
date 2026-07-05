package defpackage;

import com.anthropic.router.panes.Panes;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class px2 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    public /* synthetic */ px2(int i, zy7 zy7Var) {
        this.E = i;
        this.F = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                zy7Var.a();
                return Boolean.TRUE;
            case 1:
                zy7Var.a();
                return Boolean.TRUE;
            case 2:
                zy7Var.a();
                return Boolean.TRUE;
            case 3:
                zy7Var.a();
                return ieiVar;
            case 4:
                return new uqc((Panes) zy7Var.a());
            case 5:
                return new tjg((List) zy7Var.a());
            case 6:
                try {
                    return (List) zy7Var.a();
                } catch (SSLPeerUnverifiedException unused) {
                    return lm6.E;
                }
            case 7:
                zy7Var.a();
                return Boolean.TRUE;
            case 8:
                return Integer.valueOf(((Number) zy7Var.a()).intValue());
            case 9:
                List list = xah.a;
                xah.e(6, "User clicked login again", null, null);
                zy7Var.a();
                return ieiVar;
            case 10:
                return z82.a((t82) zy7Var.a());
            default:
                File file = (File) zy7Var.a();
                if (!nk7.m0(file).equals("preferences_pb")) {
                    sz6.o(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                    return null;
                }
                File absoluteFile = file.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
        }
    }
}
