package defpackage;

import com.anthropic.claude.conway.protocol.UploadResult;

/* JADX INFO: loaded from: classes2.dex */
public final class akg extends twj {
    public final UploadResult g;

    public akg(UploadResult uploadResult) {
        uploadResult.getClass();
        this.g = uploadResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akg) && x44.r(this.g, ((akg) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "Ready(result=" + this.g + ")";
    }
}
