package defpackage;

import android.content.Context;
import android.content.Intent;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ChatSharingEvents$ChatShareSuccess;
import com.anthropic.claude.analytics.events.ChatSharingEvents$ChatShareVisibility;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.share.ChatSnapshotSummary;

/* JADX INFO: loaded from: classes2.dex */
public final class db3 extends iwe {
    public final Context b;
    public final String c;
    public final int d;
    public final koi e;
    public final ya3 f;
    public final q7 g;
    public final vd3 h;
    public final qi3 i;
    public final ze0 j;
    public final zy1 k;
    public final lsc l;
    public final lsc m;
    public final wz5 n;
    public final wz5 o;
    public final lsc p;
    public final wz5 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db3(Context context, String str, int i, koi koiVar, ya3 ya3Var, q7 q7Var, vd3 vd3Var, qi3 qi3Var, ze0 ze0Var, h86 h86Var) {
        super(h86Var);
        context.getClass();
        str.getClass();
        this.b = context;
        this.c = str;
        this.d = i;
        this.e = koiVar;
        this.f = ya3Var;
        this.g = q7Var;
        this.h = vd3Var;
        this.i = qi3Var;
        this.j = ze0Var;
        this.k = x44.a();
        Boolean bool = Boolean.FALSE;
        this.l = mpk.P(bool);
        this.m = mpk.P(null);
        final int i2 = 0;
        this.n = mpk.w(new zy7(this) { // from class: za3
            public final /* synthetic */ db3 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                String name;
                int i3 = i2;
                db3 db3Var = this.F;
                switch (i3) {
                    case 0:
                        if (((Boolean) db3Var.l.getValue()).booleanValue()) {
                            return ((ChatSnapshotSummary) db3Var.m.getValue()) != null ? x3g.F : x3g.G;
                        }
                        return null;
                    case 1:
                        ChatSnapshotSummary chatSnapshotSummary = (ChatSnapshotSummary) db3Var.m.getValue();
                        boolean z = false;
                        if (chatSnapshotSummary != null) {
                            Integer last_message_index = chatSnapshotSummary.getLast_message_index();
                            if (db3Var.d > (last_message_index != null ? last_message_index.intValue() : 0) + 1) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        ChatConversationWithProjectReference chatConversationWithProjectReferenceI = db3Var.h.i(db3Var.c);
                        return (chatConversationWithProjectReferenceI == null || (name = chatConversationWithProjectReferenceI.getName()) == null) ? "" : name;
                }
            }
        });
        final int i3 = 1;
        this.o = mpk.w(new zy7(this) { // from class: za3
            public final /* synthetic */ db3 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                String name;
                int i32 = i3;
                db3 db3Var = this.F;
                switch (i32) {
                    case 0:
                        if (((Boolean) db3Var.l.getValue()).booleanValue()) {
                            return ((ChatSnapshotSummary) db3Var.m.getValue()) != null ? x3g.F : x3g.G;
                        }
                        return null;
                    case 1:
                        ChatSnapshotSummary chatSnapshotSummary = (ChatSnapshotSummary) db3Var.m.getValue();
                        boolean z = false;
                        if (chatSnapshotSummary != null) {
                            Integer last_message_index = chatSnapshotSummary.getLast_message_index();
                            if (db3Var.d > (last_message_index != null ? last_message_index.intValue() : 0) + 1) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        ChatConversationWithProjectReference chatConversationWithProjectReferenceI = db3Var.h.i(db3Var.c);
                        return (chatConversationWithProjectReferenceI == null || (name = chatConversationWithProjectReferenceI.getName()) == null) ? "" : name;
                }
            }
        });
        this.p = mpk.P(bool);
        final int i4 = 2;
        this.q = mpk.w(new zy7(this) { // from class: za3
            public final /* synthetic */ db3 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                String name;
                int i32 = i4;
                db3 db3Var = this.F;
                switch (i32) {
                    case 0:
                        if (((Boolean) db3Var.l.getValue()).booleanValue()) {
                            return ((ChatSnapshotSummary) db3Var.m.getValue()) != null ? x3g.F : x3g.G;
                        }
                        return null;
                    case 1:
                        ChatSnapshotSummary chatSnapshotSummary = (ChatSnapshotSummary) db3Var.m.getValue();
                        boolean z = false;
                        if (chatSnapshotSummary != null) {
                            Integer last_message_index = chatSnapshotSummary.getLast_message_index();
                            if (db3Var.d > (last_message_index != null ? last_message_index.intValue() : 0) + 1) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        ChatConversationWithProjectReference chatConversationWithProjectReferenceI = db3Var.h.i(db3Var.c);
                        return (chatConversationWithProjectReferenceI == null || (name = chatConversationWithProjectReferenceI.getName()) == null) ? "" : name;
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r1 == r12) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013e, code lost:
    
        if (P(r17, r4) == r12) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00aa -> B:34:0x00af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.db3 r17, defpackage.vp4 r18) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db3.O(db3, vp4):java.lang.Object");
    }

    public static final Object P(db3 db3Var, vp4 vp4Var) {
        return db3Var.k.b(vp4Var, new pt6(R.string.generic_error_something_went_wrong));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(boolean r13, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db3.Q(boolean, vp4):java.lang.Object");
    }

    public final void R(String str) {
        String strC = ij0.C(this.j.a(), "/share/", str);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", strC);
        String str2 = (String) this.q.getValue();
        if (bsg.I0(str2)) {
            str2 = null;
        }
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        Context context = this.b;
        Intent intentCreateChooser = Intent.createChooser(intent, context.getString(R.string.chat_sharing_snapshot_title));
        intentCreateChooser.addFlags(268435456);
        context.startActivity(intentCreateChooser);
        this.i.e(new ChatSharingEvents$ChatShareSuccess(this.e.e, this.c, Integer.valueOf(this.d), T((x3g) this.n.getValue())), ChatSharingEvents$ChatShareSuccess.Companion.serializer());
    }

    public final void S(boolean z) {
        this.p.setValue(Boolean.valueOf(z));
    }

    public final ChatSharingEvents$ChatShareVisibility T(x3g x3gVar) {
        int i = x3gVar == null ? -1 : ab3.a[x3gVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return ChatSharingEvents$ChatShareVisibility.PRIVATE;
            }
            if (i == 2) {
                int iOrdinal = (this.e.i() ? u3g.E : u3g.F).ordinal();
                if (iOrdinal == 0) {
                    return ChatSharingEvents$ChatShareVisibility.ORGANIZATION;
                }
                if (iOrdinal == 1) {
                    return ChatSharingEvents$ChatShareVisibility.PUBLIC;
                }
                wg6.i();
                return null;
            }
            if (i != 3) {
                wg6.i();
                return null;
            }
        }
        return ChatSharingEvents$ChatShareVisibility.UNSPECIFIED;
    }
}
