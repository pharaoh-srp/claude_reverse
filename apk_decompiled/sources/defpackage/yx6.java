package defpackage;

import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemAvailability;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemNudgesItemMethod;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemStatus;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemAvailability;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemNudgesItemMethod;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class yx6 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[EventCreateV1InputNewEventsItemNudgesItemMethod.values().length];
        try {
            iArr[EventCreateV1InputNewEventsItemNudgesItemMethod.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EventCreateV1InputNewEventsItemNudgesItemMethod.SMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EventCreateV1InputNewEventsItemNudgesItemMethod.ALARM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[EventUpdateV0InputEventUpdatesItemNudgesItemMethod.values().length];
        try {
            iArr2[EventUpdateV0InputEventUpdatesItemNudgesItemMethod.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EventUpdateV0InputEventUpdatesItemNudgesItemMethod.SMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EventUpdateV0InputEventUpdatesItemNudgesItemMethod.ALARM.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EventUpdateV0InputEventUpdatesItemNudgesItemMethod.NOTIFICATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[EventUpdateV0InputEventUpdatesItemStatus.values().length];
        try {
            iArr3[EventUpdateV0InputEventUpdatesItemStatus.CONFIRMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[EventUpdateV0InputEventUpdatesItemStatus.TENTATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[EventUpdateV0InputEventUpdatesItemStatus.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
        int[] iArr4 = new int[EventUpdateV0InputEventUpdatesItemAvailability.values().length];
        try {
            iArr4[EventUpdateV0InputEventUpdatesItemAvailability.BUSY.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[EventUpdateV0InputEventUpdatesItemAvailability.FREE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[EventUpdateV0InputEventUpdatesItemAvailability.TENTATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        d = iArr4;
        int[] iArr5 = new int[EventCreateV1InputNewEventsItemStatus.values().length];
        try {
            iArr5[EventCreateV1InputNewEventsItemStatus.CONFIRMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[EventCreateV1InputNewEventsItemStatus.TENTATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[EventCreateV1InputNewEventsItemStatus.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        e = iArr5;
        int[] iArr6 = new int[EventCreateV1InputNewEventsItemAvailability.values().length];
        try {
            iArr6[EventCreateV1InputNewEventsItemAvailability.BUSY.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr6[EventCreateV1InputNewEventsItemAvailability.FREE.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr6[EventCreateV1InputNewEventsItemAvailability.TENTATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        f = iArr6;
    }
}
