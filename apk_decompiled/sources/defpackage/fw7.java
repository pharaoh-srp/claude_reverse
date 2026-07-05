package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes3.dex */
public final class fw7 extends tie {
    public static final p8b c;
    public final List a;
    public final List b;

    static {
        ide ideVar = p8b.e;
        c = nai.D("application/x-www-form-urlencoded");
    }

    public fw7(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.a = blj.k(arrayList);
        this.b = blj.k(arrayList2);
    }

    public final long a(BufferedSink bufferedSink, boolean z) throws EOFException {
        Buffer f;
        if (z) {
            f = new Buffer();
        } else {
            bufferedSink.getClass();
            f = bufferedSink.getF();
        }
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                f.B0(38);
            }
            f.T0((String) list.get(i));
            f.B0(61);
            f.T0((String) this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = f.F;
        f.c();
        return j;
    }

    @Override // defpackage.tie
    public final long contentLength() {
        return a(null, true);
    }

    @Override // defpackage.tie
    /* JADX INFO: renamed from: contentType */
    public final p8b getContentType() {
        return c;
    }

    @Override // defpackage.tie
    public final void writeTo(BufferedSink bufferedSink) throws EOFException {
        bufferedSink.getClass();
        a(bufferedSink, false);
    }
}
