package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.ChatMessage;
import com.anthropic.claude.types.strings.MessageId;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yuj {
    public static final ta4 a = new ta4(-323019162, false, new p6(27));
    public static final ta4 b = new ta4(-587666652, false, new p6(28));
    public static final ta4 c = new ta4(1920315007, false, new ua4(2));
    public static final o54 d = o54.H;
    public static final q0g e = q0g.G;
    public static final o54 f = o54.F;
    public static final aci g = aci.G;

    /* JADX WARN: Removed duplicated region for block: B:114:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ya8 r19, defpackage.iqb r20, defpackage.lx9 r21, defpackage.mnc r22, defpackage.jo0 r23, defpackage.go0 r24, defpackage.eo7 r25, boolean r26, defpackage.b20 r27, defpackage.bz7 r28, defpackage.ld4 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yuj.a(ya8, iqb, lx9, mnc, jo0, go0, eo7, boolean, b20, bz7, ld4, int, int):void");
    }

    public static final ArrayList b(int i, int i2, int i3) {
        int i4 = i - ((i2 - 1) * i3);
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    public static final double e(int i, int i2) {
        return ((((long) i) << 27) + ((long) i2)) / 9.007199254740992E15d;
    }

    public static final float f(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static float g(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? xi6.b(edgeEffect) : MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public static float h(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return xi6.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static final ese i(String str, ArrayList arrayList) {
        str.getClass();
        int iD0 = tta.d0(x44.y(arrayList, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Object obj : arrayList) {
            linkedHashMap.put(MessageId.m1051boximpl(((ChatMessage) obj).m216getUuidPStrttk()), obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        ChatMessage chatMessage = (ChatMessage) linkedHashMap.get(MessageId.m1051boximpl(str));
        while (true) {
            if (chatMessage == null) {
                break;
            }
            if (!linkedHashSet.add(MessageId.m1051boximpl(chatMessage.m216getUuidPStrttk()))) {
                List list = xah.a;
                xah.f(new IllegalStateException(ij0.i("Cycle detected in message tree at ", MessageId.m1056toStringimpl(chatMessage.m216getUuidPStrttk()))), "walkBranchFromLeaf hit a cycle", ozf.G, null, 24);
                break;
            }
            arrayList2.add(chatMessage);
            String strM215getParent_message_uuidsaiyK68 = chatMessage.m215getParent_message_uuidsaiyK68();
            if (strM215getParent_message_uuidsaiyK68 != null) {
                MessageId.Companion.getClass();
                if (!MessageId.m1054equalsimpl0(strM215getParent_message_uuidsaiyK68, MessageId.ROOT_PARENT_UUID)) {
                    chatMessage = (ChatMessage) linkedHashMap.get(MessageId.m1051boximpl(strM215getParent_message_uuidsaiyK68));
                }
            }
            chatMessage = null;
        }
        return new ese(arrayList2);
    }

    public static final b62 j(ChatMessage chatMessage, String str, bg9 bg9Var) {
        chatMessage.getClass();
        str.getClass();
        return new b62(chatMessage.m216getUuidPStrttk(), str, bg9Var.d(chatMessage, ChatMessage.Companion.serializer()));
    }

    public static final ArrayList k(List list, bg9 bg9Var) {
        ChatMessage chatMessage;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b62 b62Var = (b62) it.next();
            try {
                b62Var.getClass();
                chatMessage = (ChatMessage) bg9Var.b(b62Var.c, ChatMessage.Companion.serializer());
            } catch (Exception e2) {
                List list2 = xah.a;
                xah.f(e2, ij0.i("Failed to deserialize message ", b62Var.a), ozf.F, null, 24);
                chatMessage = null;
            }
            if (chatMessage != null) {
                arrayList.add(chatMessage);
            }
        }
        return arrayList;
    }

    public gjb c(mjb mjbVar) {
        ByteBuffer byteBuffer = mjbVar.I;
        byteBuffer.getClass();
        fd9.E(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return d(mjbVar, byteBuffer);
    }

    public abstract gjb d(mjb mjbVar, ByteBuffer byteBuffer);
}
