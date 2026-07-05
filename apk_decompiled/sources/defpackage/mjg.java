package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class mjg {
    public final File a;

    public mjg(File file, wof wofVar) {
        this.a = file;
    }

    public final ljg a() {
        oqb oqbVar = njg.a;
        if (!Boolean.FALSE.booleanValue()) {
            return null;
        }
        File file = this.a;
        file.mkdirs();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            Iterator it = w44.I0(mp0.U0(fileArrListFiles, new x8e(11)), 19).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
        File file2 = new File(file, kgh.o(new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(new Date()), ".sse"));
        return new ljg(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), dj2.a), FreeTypeConstants.FT_LOAD_LINEAR_DESIGN));
    }
}
