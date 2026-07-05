package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class hqe {
    public final Resources a;
    public final Resources.Theme b;

    public hqe(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hqe.class == obj.getClass()) {
            hqe hqeVar = (hqe) obj;
            if (this.a.equals(hqeVar.a) && Objects.equals(this.b, hqeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
