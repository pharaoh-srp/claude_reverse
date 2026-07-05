package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class vi7 implements qp9 {
    public final boolean a;

    public vi7(boolean z) {
        this.a = z;
    }

    @Override // defpackage.qp9
    public final String a(Object obj, rjc rjcVar) {
        File file = (File) obj;
        if (!this.a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
