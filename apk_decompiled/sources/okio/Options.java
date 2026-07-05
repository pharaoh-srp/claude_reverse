package okio;

import defpackage.i2;
import defpackage.mdj;
import defpackage.sz6;
import java.util.ArrayList;
import java.util.RandomAccess;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lokio/Options;", "Li2;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class Options extends i2 implements RandomAccess {
    public final ByteString[] E;
    public final int[] F;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/Options$Companion;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public static void a(long j, Buffer buffer, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
            int i4;
            int i5;
            ArrayList arrayList3;
            long j2;
            int i6;
            int i7 = i;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i2 >= i3) {
                sz6.p("Failed requirement.");
                return;
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (((ByteString) arrayList4.get(i8)).e() < i7) {
                    sz6.p("Failed requirement.");
                    return;
                }
            }
            ByteString byteString = (ByteString) arrayList.get(i2);
            ByteString byteString2 = (ByteString) arrayList4.get(i3 - 1);
            if (i7 == byteString.e()) {
                int iIntValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                ByteString byteString3 = (ByteString) arrayList4.get(i9);
                i4 = i9;
                i5 = iIntValue;
                byteString = byteString3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (byteString.j(i7) == byteString2.j(i7)) {
                int iMin = Math.min(byteString.e(), byteString2.e());
                int i10 = 0;
                for (int i11 = i7; i11 < iMin && byteString.j(i11) == byteString2.j(i11); i11++) {
                    i10++;
                }
                long j3 = (buffer.F / 4) + j + 2 + ((long) i10) + 1;
                buffer.P0(-i10);
                buffer.P0(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    buffer.P0(byteString.j(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i12 == ((ByteString) arrayList4.get(i4)).e()) {
                        buffer.P0(((Number) arrayList5.get(i4)).intValue());
                        return;
                    } else {
                        sz6.j("Check failed.");
                        return;
                    }
                }
                Buffer buffer2 = new Buffer();
                buffer.P0(((int) ((buffer2.F / 4) + j3)) * (-1));
                a(j3, buffer2, i12, arrayList4, i4, i3, arrayList5);
                buffer.f0(buffer2);
                return;
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (((ByteString) arrayList4.get(i14 - 1)).j(i7) != ((ByteString) arrayList4.get(i14)).j(i7)) {
                    i13++;
                }
            }
            long j4 = (buffer.F / 4) + j + 2 + ((long) (i13 * 2));
            buffer.P0(i13);
            buffer.P0(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                int iJ = ((ByteString) arrayList4.get(i15)).j(i7);
                if (i15 == i4 || iJ != ((ByteString) arrayList4.get(i15 - 1)).j(i7)) {
                    buffer.P0(iJ & 255);
                }
            }
            Buffer buffer3 = new Buffer();
            int i16 = i4;
            while (i16 < i3) {
                byte bJ = ((ByteString) arrayList4.get(i16)).j(i7);
                int i17 = i16 + 1;
                int i18 = i17;
                while (true) {
                    if (i18 >= i3) {
                        i18 = i3;
                        break;
                    } else if (bJ != ((ByteString) arrayList4.get(i18)).j(i7)) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i17 == i18 && i7 + 1 == ((ByteString) arrayList4.get(i16)).e()) {
                    buffer.P0(((Number) arrayList5.get(i16)).intValue());
                    arrayList3 = arrayList5;
                    j2 = j4;
                    i6 = i18;
                } else {
                    buffer.P0(((int) ((buffer3.F / 4) + j4)) * (-1));
                    arrayList3 = arrayList5;
                    j2 = j4;
                    i6 = i18;
                    a(j2, buffer3, i7 + 1, arrayList, i16, i6, arrayList3);
                    arrayList4 = arrayList;
                }
                j4 = j2;
                i16 = i6;
                arrayList5 = arrayList3;
            }
            buffer.f0(buffer3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static okio.Options b(okio.ByteString... r11) {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.b(okio.ByteString[]):okio.Options");
        }
    }

    public Options(ByteString[] byteStringArr, int[] iArr) {
        this.E = byteStringArr;
        this.F = iArr;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.E[i];
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.E.length;
    }

    @Override // defpackage.i2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // defpackage.i2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
