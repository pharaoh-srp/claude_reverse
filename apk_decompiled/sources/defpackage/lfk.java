package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class lfk extends dqk implements Serializable {
    public final MessageDigest F;
    public final int G;
    public final boolean H;
    public final String I;

    public lfk() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.F = messageDigest;
            this.G = messageDigest.getDigestLength();
            this.I = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.H = z;
        } catch (NoSuchAlgorithmException e) {
            sz6.h(e);
            throw null;
        }
    }

    public final String toString() {
        return this.I;
    }
}
