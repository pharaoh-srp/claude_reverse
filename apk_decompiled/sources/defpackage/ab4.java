package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemAvailability;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ab4 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EventUpdateV0InputEventUpdatesItemAvailability.values().length];
        try {
            iArr[EventUpdateV0InputEventUpdatesItemAvailability.BUSY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EventUpdateV0InputEventUpdatesItemAvailability.FREE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EventUpdateV0InputEventUpdatesItemAvailability.TENTATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[EventUpdateV0InputEventUpdatesItemStatus.values().length];
        try {
            iArr2[EventUpdateV0InputEventUpdatesItemStatus.CONFIRMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EventUpdateV0InputEventUpdatesItemStatus.TENTATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EventUpdateV0InputEventUpdatesItemStatus.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
