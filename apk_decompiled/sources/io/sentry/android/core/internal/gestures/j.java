package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final int[] a = new int[2];

    public static io.sentry.internal.gestures.c a(SentryAndroidOptions sentryAndroidOptions, View view, float f, float f2, io.sentry.internal.gestures.b bVar) {
        List<io.sentry.internal.gestures.a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.c cVar = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (view2 != null) {
                int[] iArr = a;
                view2.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (f >= i && f <= i + width && f2 >= i2 && f2 <= i2 + height) {
                    if (view2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            linkedList.add(viewGroup.getChildAt(i3));
                        }
                    }
                    for (int i4 = 0; i4 < gestureTargetLocators.size(); i4++) {
                        io.sentry.internal.gestures.c cVarA = gestureTargetLocators.get(i4).a(view2, f, f2, bVar);
                        if (cVarA != null) {
                            if (bVar == io.sentry.internal.gestures.b.CLICKABLE) {
                                cVar = cVarA;
                            } else if (bVar == io.sentry.internal.gestures.b.SCROLLABLE) {
                                return cVarA;
                            }
                        }
                    }
                }
            }
        }
        return cVar;
    }

    public static String b(View view) {
        int id = view.getId();
        if (id == -1 || (((-16777216) & id) == 0 && (16777215 & id) != 0)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : "";
    }
}
