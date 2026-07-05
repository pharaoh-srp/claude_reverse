package defpackage;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class mh3 implements pjb {
    public static final Logger a = Logger.getLogger(mh3.class.getName());

    @Override // defpackage.pjb
    public final InputStream a(String str) {
        InputStream resourceAsStream = mh3.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            a.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
