package defpackage;

import android.view.PixelCopy;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class i8f implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ a3f a;
    public final /* synthetic */ View b;

    public i8f(a3f a3fVar, View view) {
        this.a = a3fVar;
        this.b = view;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        if (i != 0) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String str = "PixelCopy failed for " + this.b.getClass().getSimpleName() + ": " + i;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.WARN, "ScreenshotTaker", str);
                    }
                }
            }
        }
        this.a.resumeWith(Boolean.valueOf(i == 0));
    }
}
