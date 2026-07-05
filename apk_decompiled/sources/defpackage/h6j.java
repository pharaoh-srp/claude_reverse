package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Environment;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h6j {
    public final ContentResolver a;
    public final Uri b;
    public final String c;
    public final String d;
    public final ArrayList e = new ArrayList();
    public volatile boolean f;

    public h6j(ContentResolver contentResolver, Uri uri, String str) {
        this.a = contentResolver;
        this.b = uri;
        this.c = str;
        this.d = ij0.C(Environment.DIRECTORY_DOWNLOADS, "/", str);
    }

    public final void a() {
        int length;
        byte[] bArr;
        if (this.f) {
            return;
        }
        this.f = true;
        synchronized (this.e) {
            try {
                Iterator it = this.e.iterator();
                length = 0;
                while (it.hasNext()) {
                    length += ((byte[]) it.next()).length;
                }
                bArr = new byte[length];
                int length2 = 0;
                for (byte[] bArr2 : this.e) {
                    mp0.w0(bArr2, bArr, length2, 0, 0, 12);
                    length2 += bArr2.length;
                }
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        ContentResolver contentResolver = this.a;
        Uri uri = this.b;
        try {
            if (length == 0) {
                contentResolver.delete(uri, null, null);
                return;
            }
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
            if (outputStreamOpenOutputStream == null) {
                this.a.delete(this.b, null, null);
                return;
            }
            try {
                outputStreamOpenOutputStream.write(esk.j(length));
                outputStreamOpenOutputStream.write(bArr);
                outputStreamOpenOutputStream.close();
                ContentResolver contentResolver2 = this.a;
                Uri uri2 = this.b;
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_pending", (Integer) 0);
                contentResolver2.update(uri2, contentValues, null, null);
            } finally {
            }
        } catch (Exception e) {
            try {
                this.a.delete(this.b, null, null);
            } catch (Throwable unused) {
            }
            List list = xah.a;
            ozf ozfVar = ozf.F;
            Map mapSingletonMap = Collections.singletonMap("category", "tts");
            mapSingletonMap.getClass();
            xah.f(e, "Conway speak save-to-file failed", ozfVar, mapSingletonMap, 16);
        }
    }
}
