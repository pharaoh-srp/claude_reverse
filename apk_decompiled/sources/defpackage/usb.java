package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class usb implements fjb {
    public final int a;

    public usb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usb) && this.a == ((usb) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}
