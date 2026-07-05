package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.anthropic.claude.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h5 {
    public static final View.AccessibilityDelegate G = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate E;
    public final g5 F;

    public h5(View.AccessibilityDelegate accessibilityDelegate) {
        this.E = accessibilityDelegate;
        this.F = new g5(this);
    }

    public efe a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.E.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new efe(2, accessibilityNodeProvider);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.E.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, i6 i6Var) {
        this.E.onInitializeAccessibilityNodeInfo(view, i6Var.a);
    }

    public boolean d(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        for (int i2 = 0; i2 < list.size() && ((b6) list.get(i2)).a() != i; i2++) {
        }
        boolean zPerformAccessibilityAction = this.E.performAccessibilityAction(view, i, bundle);
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
                i4++;
            }
        }
        return z;
    }

    public h5() {
        this(G);
    }
}
