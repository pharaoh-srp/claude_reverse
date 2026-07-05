package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class mi0 extends li0 {
    @Override // defpackage.li0, defpackage.ni0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.ni0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
