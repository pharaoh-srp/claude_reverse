package defpackage;

import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class urg implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        wrg wrgVar = (wrg) obj;
        CharSequence charSequence = (CharSequence) obj2;
        pqi.p(wrgVar.a);
        if (!wrgVar.c) {
            wrgVar.a.append(wrgVar.b);
        }
        wrgVar.a.append((Object) charSequence);
        wrgVar.c = false;
    }
}
