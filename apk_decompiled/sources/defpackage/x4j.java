package defpackage;

import java.io.File;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x4j {
    public final x1d a;
    public final File b;
    public final jxb c = new jxb();
    public final LinkedHashMap d = new LinkedHashMap();

    public x4j(File file, hdc hdcVar) {
        this.a = new x1d(hdcVar, (tp4) null, 17);
        this.b = new File(file, "VoiceSamples");
    }
}
