package okio;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.mdj;
import defpackage.mp0;
import defpackage.mr9;
import defpackage.sz6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/Segment;", "", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class Segment {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public Segment f;
    public Segment g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lokio/Segment$Companion;", "", "", "SIZE", "I", "SHARE_MINIMUM", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
    }

    public Segment(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final Segment a() {
        Segment segment = this.f;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.g;
        segment2.getClass();
        segment2.f = this.f;
        Segment segment3 = this.f;
        segment3.getClass();
        segment3.g = this.g;
        this.f = null;
        this.g = null;
        return segment;
    }

    public final void b(Segment segment) {
        segment.getClass();
        segment.g = this;
        segment.f = this.f;
        Segment segment2 = this.f;
        segment2.getClass();
        segment2.g = segment;
        this.f = segment;
    }

    public final Segment c() {
        this.d = true;
        return new Segment(this.a, this.b, this.c, true, false);
    }

    public final void d(Segment segment, int i) {
        segment.getClass();
        if (!segment.e) {
            sz6.j("only owner can write");
            return;
        }
        int i2 = segment.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (segment.d) {
                mr9.y();
                return;
            }
            int i4 = segment.b;
            if (i3 - i4 > 8192) {
                mr9.y();
                return;
            }
            byte[] bArr = segment.a;
            mp0.w0(bArr, bArr, 0, i4, i2, 2);
            segment.c -= segment.b;
            segment.b = 0;
        }
        byte[] bArr2 = segment.a;
        int i5 = segment.c;
        int i6 = this.b;
        mp0.q0(i5, i6, i6 + i, this.a, bArr2);
        segment.c += i;
        this.b += i;
    }

    public Segment() {
        this.a = new byte[FreeTypeConstants.FT_LOAD_LINEAR_DESIGN];
        this.e = true;
        this.d = false;
    }
}
