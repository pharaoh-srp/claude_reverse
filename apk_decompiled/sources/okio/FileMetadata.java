package okio;

import defpackage.mdj;
import defpackage.nm6;
import defpackage.sta;
import defpackage.w44;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/FileMetadata;", "", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class FileMetadata {
    public final boolean a;
    public final boolean b;
    public final Path c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map h;

    public FileMetadata(boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4, Map map) {
        map.getClass();
        this.a = z;
        this.b = z2;
        this.c = path;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = sta.q0(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map map = this.h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return w44.S0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ FileMetadata(boolean z, boolean z2, Path path, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, path, l, l2, l3, l4, nm6.E);
    }
}
