package defpackage;

import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes2.dex */
public final class neh extends zdh {
    public final TextClassification b;
    public final int c;

    public neh(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.b = textClassification;
        this.c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.a);
        sb.append(", textClassification=");
        sb.append(this.b);
        sb.append(", index=");
        return vb7.r(sb, this.c, ')');
    }
}
