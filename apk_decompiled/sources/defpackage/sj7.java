package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class sj7 extends pj7 {
    public boolean b;
    public File[] c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj7(g96 g96Var, File file) {
        super(file);
        file.getClass();
    }

    @Override // defpackage.tj7
    public final File a() {
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.c;
        fileArr2.getClass();
        int i = this.d;
        this.d = i + 1;
        return fileArr2[i];
    }
}
