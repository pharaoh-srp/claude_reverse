package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mh0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        xn4 pojVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                pojVar = new poj(clipData, 3);
            } else {
                yn4 yn4Var = new yn4();
                yn4Var.F = clipData;
                yn4Var.G = 3;
                pojVar = yn4Var;
            }
            mvi.f(textView, pojVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        xn4 pojVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            pojVar = new poj(clipData, 3);
        } else {
            yn4 yn4Var = new yn4();
            yn4Var.F = clipData;
            yn4Var.G = 3;
            pojVar = yn4Var;
        }
        mvi.f(view, pojVar.build());
        return true;
    }
}
