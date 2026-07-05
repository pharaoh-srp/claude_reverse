package io.sentry.android.core.internal.threaddump;

import android.graphics.Bitmap;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final int a;
    public int b;
    public final Object c;

    public b(Bitmap bitmap, int i, int i2) {
        bitmap.getClass();
        this.c = bitmap;
        this.a = i;
        this.b = i2;
    }

    public static b b(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new b(arrayList);
            }
            a aVar = new a();
            aVar.a = line;
            arrayList.add(aVar);
        }
    }

    public a a() {
        int i = this.b;
        if (i < 0 || i >= this.a) {
            return null;
        }
        ArrayList arrayList = (ArrayList) this.c;
        this.b = i + 1;
        return (a) arrayList.get(i);
    }

    public b(ArrayList arrayList) {
        this.c = arrayList;
        this.a = arrayList.size();
    }
}
