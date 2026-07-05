package defpackage;

import java.io.IOException;
import org.jsoup.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class n0e extends gjk {
    public final /* synthetic */ int q;
    public final Appendable r;

    public /* synthetic */ n0e(Appendable appendable, int i) {
        this.q = i;
        this.r = appendable;
    }

    @Override // defpackage.gjk
    public final gjk g(char c) {
        switch (this.q) {
            case 0:
                try {
                    this.r.append(c);
                    return this;
                } catch (IOException e) {
                    throw new SerializationException(e);
                }
            default:
                ((StringBuilder) this.r).append(c);
                return this;
        }
    }

    @Override // defpackage.gjk
    public final gjk h(String str) {
        switch (this.q) {
            case 0:
                try {
                    this.r.append(str);
                    return this;
                } catch (IOException e) {
                    throw new SerializationException(e);
                }
            default:
                ((StringBuilder) this.r).append((CharSequence) str);
                return this;
        }
    }

    @Override // defpackage.gjk
    public final gjk i(char[] cArr, int i) {
        switch (this.q) {
            case 0:
                try {
                    this.r.append(new String(cArr, 0, i));
                    return this;
                } catch (IOException e) {
                    throw new SerializationException(e);
                }
            default:
                ((StringBuilder) this.r).append(cArr, 0, i);
                return this;
        }
    }

    public String toString() {
        switch (this.q) {
            case 1:
                return ((StringBuilder) this.r).toString();
            default:
                return super.toString();
        }
    }
}
