package com.anthropic.claude.chat.input.files;

import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;
import com.anthropic.claude.analytics.events.ChatEvents$AddFileFailed;
import com.anthropic.claude.analytics.events.ChatEvents$AddFileSuccess;
import com.anthropic.claude.analytics.events.ChatEvents$AddImageFailed;
import com.anthropic.claude.analytics.events.ChatEvents$UploadSource;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.anthropic.claude.api.chat.MessageUnknownFile;
import com.anthropic.claude.chat.input.files.FileUploadWorker;
import com.anthropic.claude.chat.input.files.a;
import com.anthropic.claude.configs.flags.UploadConfig;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.b54;
import defpackage.bi7;
import defpackage.bj0;
import defpackage.bz7;
import defpackage.c8a;
import defpackage.ck7;
import defpackage.e31;
import defpackage.f31;
import defpackage.fkg;
import defpackage.fn0;
import defpackage.g31;
import defpackage.gb9;
import defpackage.h21;
import defpackage.h31;
import defpackage.i31;
import defpackage.iei;
import defpackage.it2;
import defpackage.j31;
import defpackage.jw2;
import defpackage.k21;
import defpackage.kdg;
import defpackage.koi;
import defpackage.ky0;
import defpackage.lf9;
import defpackage.lw2;
import defpackage.m45;
import defpackage.mpk;
import defpackage.mq5;
import defpackage.mr9;
import defpackage.mw2;
import defpackage.nhd;
import defpackage.nw2;
import defpackage.oda;
import defpackage.ohd;
import defpackage.pb2;
import defpackage.phd;
import defpackage.pt6;
import defpackage.pz7;
import defpackage.q7;
import defpackage.qi3;
import defpackage.qw2;
import defpackage.rw2;
import defpackage.si7;
import defpackage.sw2;
import defpackage.tie;
import defpackage.tp4;
import defpackage.tw2;
import defpackage.uji;
import defpackage.uw2;
import defpackage.v0;
import defpackage.vji;
import defpackage.vp4;
import defpackage.vt6;
import defpackage.vw2;
import defpackage.wji;
import defpackage.ww2;
import defpackage.wz5;
import defpackage.x44;
import defpackage.xji;
import defpackage.xzg;
import defpackage.yji;
import defpackage.yw2;
import defpackage.zo;
import defpackage.zy7;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements yw2 {
    public static final /* synthetic */ int q = 0;
    public final q7 b;
    public final qi3 c;
    public final oda d;
    public final bi7 e;
    public final k21 f;
    public final ck7 g;
    public final bj0 h;
    public final fn0 i;
    public final i j;
    public final koi k;
    public final kdg l;
    public final kdg m;
    public final ConcurrentHashMap n;
    public final wz5 o;
    public final wz5 p;

    public a(q7 q7Var, qi3 qi3Var, oda odaVar, bi7 bi7Var, k21 k21Var, ck7 ck7Var, bj0 bj0Var, fn0 fn0Var, i iVar, koi koiVar) {
        this.b = q7Var;
        this.c = qi3Var;
        this.d = odaVar;
        this.e = bi7Var;
        this.f = k21Var;
        this.g = ck7Var;
        this.h = bj0Var;
        this.i = fn0Var;
        this.j = iVar;
        this.k = koiVar;
        kdg kdgVar = new kdg();
        this.l = kdgVar;
        this.m = kdgVar;
        this.n = new ConcurrentHashMap();
        final int i = 0;
        this.o = mpk.w(new zy7(this) { // from class: zw2
            public final /* synthetic */ a F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                c8a c8aVar;
                int i2 = i;
                boolean z = false;
                a aVar = this.F;
                switch (i2) {
                    case 0:
                        kdg kdgVar2 = aVar.m;
                        if (kdgVar2 == null || !kdgVar2.isEmpty()) {
                            ListIterator listIterator = kdgVar2.listIterator();
                            do {
                                c8aVar = (c8a) listIterator;
                                if (!c8aVar.hasNext()) {
                                    z = true;
                                }
                            } while (!(((ww2) c8aVar.next()) instanceof sw2));
                        } else {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        kdg kdgVar3 = aVar.m;
                        if (kdgVar3 == null || !kdgVar3.isEmpty()) {
                            ListIterator listIterator2 = kdgVar3.listIterator();
                            while (true) {
                                c8a c8aVar2 = (c8a) listIterator2;
                                if (c8aVar2.hasNext()) {
                                    ww2 ww2Var = (ww2) c8aVar2.next();
                                    if (!(ww2Var instanceof sw2) || ((sw2) ww2Var).l() != null) {
                                    }
                                }
                            }
                        } else {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i2 = 1;
        this.p = mpk.w(new zy7(this) { // from class: zw2
            public final /* synthetic */ a F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                c8a c8aVar;
                int i22 = i2;
                boolean z = false;
                a aVar = this.F;
                switch (i22) {
                    case 0:
                        kdg kdgVar2 = aVar.m;
                        if (kdgVar2 == null || !kdgVar2.isEmpty()) {
                            ListIterator listIterator = kdgVar2.listIterator();
                            do {
                                c8aVar = (c8a) listIterator;
                                if (!c8aVar.hasNext()) {
                                    z = true;
                                }
                            } while (!(((ww2) c8aVar.next()) instanceof sw2));
                        } else {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        kdg kdgVar3 = aVar.m;
                        if (kdgVar3 == null || !kdgVar3.isEmpty()) {
                            ListIterator listIterator2 = kdgVar3.listIterator();
                            while (true) {
                                c8a c8aVar2 = (c8a) listIterator2;
                                if (c8aVar2.hasNext()) {
                                    ww2 ww2Var = (ww2) c8aVar2.next();
                                    if (!(ww2Var instanceof sw2) || ((sw2) ww2Var).l() != null) {
                                    }
                                }
                            }
                        } else {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    public static final Object l(a aVar, yji yjiVar, sw2 sw2Var, String str, ChatEvents$AddAttachment chatEvents$AddAttachment, ChatEvents$UploadSource chatEvents$UploadSource, pz7 pz7Var, xzg xzgVar) {
        Object nw2Var;
        kdg kdgVar = aVar.l;
        boolean z = yjiVar instanceof xji;
        iei ieiVar = iei.a;
        tp4 tp4Var = null;
        int i = 0;
        if (z) {
            xji xjiVar = (xji) yjiVar;
            MessageFile messageFileA = xjiVar.a();
            if (messageFileA instanceof MessageImageFile) {
                nw2Var = new qw2(sw2Var.j(), (MessageImageFile) messageFileA, sw2Var.i());
            } else if (messageFileA instanceof MessageDocumentFile) {
                nw2Var = new mw2(sw2Var.j(), (MessageDocumentFile) messageFileA);
            } else if (messageFileA instanceof MessageBlobFile) {
                nw2Var = new lw2(sw2Var.j(), (MessageBlobFile) messageFileA);
            } else {
                if (!(messageFileA instanceof MessageUnknownFile)) {
                    mr9.b();
                    return null;
                }
                nw2Var = new nw2(sw2Var.j(), (MessageUnknownFile) messageFileA);
            }
            ListIterator listIterator = kdgVar.listIterator();
            while (true) {
                c8a c8aVar = (c8a) listIterator;
                if (!c8aVar.hasNext()) {
                    i = -1;
                    break;
                }
                if (x44.r(((ww2) c8aVar.next()).j(), sw2Var.j())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                kdgVar.set(i, nw2Var);
                return ieiVar;
            }
            if (str != null && aVar.g.f(str)) {
                gb9.D(aVar.i, null, null, new pb2(aVar, str, xjiVar.a(), tp4Var, 10), 3);
                return ieiVar;
            }
        } else {
            if (yjiVar instanceof vji) {
                MessageAttachment messageAttachmentA = ((vji) yjiVar).a();
                ListIterator listIterator2 = kdgVar.listIterator();
                int i2 = 0;
                while (true) {
                    c8a c8aVar2 = (c8a) listIterator2;
                    if (!c8aVar2.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (x44.r(((ww2) c8aVar2.next()).j(), sw2Var.j())) {
                        break;
                    }
                    i2++;
                }
                Integer numValueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                if (numValueOf != null) {
                    kdgVar.set(numValueOf.intValue(), new jw2(sw2Var.j(), messageAttachmentA));
                }
                aVar.c.e(new ChatEvents$AddFileSuccess(chatEvents$AddAttachment.getOrganization_uuid(), chatEvents$AddAttachment.getConversation_uuid(), chatEvents$AddAttachment.getUti(), chatEvents$AddAttachment.getSource(), r1.a().getFile_size(), chatEvents$AddAttachment.getScreen_source(), chatEvents$AddAttachment.is_wiggle_upload(), new Integer(0), chatEvents$UploadSource, Boolean.valueOf(!aVar.h.b()), (Integer) null, FreeTypeConstants.FT_LOAD_NO_RECURSE, (mq5) null), ChatEvents$AddFileSuccess.Companion.serializer());
                return ieiVar;
            }
            boolean z2 = yjiVar instanceof wji;
            vw2 vw2Var = vw2.F;
            if (!z2) {
                if (!x44.r(yjiVar, uji.a)) {
                    mr9.b();
                    return null;
                }
                sw2Var.h(vw2Var);
                aVar.s(sw2Var instanceof rw2, chatEvents$AddAttachment, h21.G, str, chatEvents$UploadSource, 0, null, null);
                return ieiVar;
            }
            wji wjiVar = (wji) yjiVar;
            if (!wjiVar.e()) {
                vw2Var = vw2.E;
            }
            sw2Var.h(vw2Var);
            aVar.s(sw2Var instanceof rw2, chatEvents$AddAttachment, wjiVar.c(), str, chatEvents$UploadSource, wjiVar.d(), wjiVar.f(), wjiVar.a());
            vt6 vt6VarB = wjiVar.b();
            if (vt6VarB == null) {
                vt6VarB = new pt6(R.string.chat_input_upload_failed);
            }
            Object objInvoke = pz7Var.invoke(vt6VarB, xzgVar);
            if (objInvoke == m45.E) {
                return objInvoke;
            }
        }
        return ieiVar;
    }

    public static final Object m(a aVar, j31 j31Var, si7 si7Var, ky0 ky0Var) {
        k21 k21Var = aVar.f;
        if (j31Var.equals(e31.b)) {
            return k21Var.b(si7Var, ky0Var);
        }
        if (j31Var.equals(f31.b) || j31Var.equals(h31.b)) {
            return k21Var.a(si7Var, ky0Var);
        }
        if (j31Var.equals(i31.b) || (j31Var instanceof g31)) {
            g31 g31Var = j31Var instanceof g31 ? (g31) j31Var : null;
            return new ohd(g31Var != null ? g31Var.a() : h21.E);
        }
        mr9.b();
        return null;
    }

    public static final yji n(a aVar, phd phdVar) {
        aVar.getClass();
        if (phdVar instanceof nhd) {
            return new vji(((nhd) phdVar).a());
        }
        if (phdVar instanceof ohd) {
            ohd ohdVar = (ohd) phdVar;
            return new wji(ohdVar.c(), false, 0, ohdVar.b(), null, ohdVar.a(), 20);
        }
        mr9.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(com.anthropic.claude.chat.input.files.a r18, java.lang.String r19, defpackage.tw2 r20, com.anthropic.claude.analytics.events.ChatEvents$UploadSource r21, defpackage.bz7 r22, defpackage.vp4 r23) {
        /*
            r0 = r18
            r6 = r22
            r1 = r23
            boolean r2 = r1 instanceof defpackage.bx2
            if (r2 == 0) goto L1a
            r2 = r1
            bx2 r2 = (defpackage.bx2) r2
            int r3 = r2.G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.G = r3
        L18:
            r8 = r2
            goto L20
        L1a:
            bx2 r2 = new bx2
            r2.<init>(r0, r1)
            goto L18
        L20:
            java.lang.Object r1 = r8.E
            int r2 = r8.G
            r3 = 1
            r9 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            defpackage.sf5.h0(r1)
            goto L5d
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r9
        L34:
            defpackage.sf5.h0(r1)
            ck7 r0 = r0.g
            dk7 r2 = r20.b()
            com.anthropic.claude.analytics.events.ChatEvents$AddAttachment r1 = r20.a()
            if (r6 == 0) goto L4b
            zb2 r4 = new zb2
            r5 = 2
            r4.<init>(r5, r6)
            r7 = r4
            goto L4c
        L4b:
            r7 = r9
        L4c:
            r8.G = r3
            r5 = 0
            r4 = r21
            r3 = r1
            r1 = r19
            java.lang.Object r1 = r0.g(r1, r2, r3, r4, r5, r6, r7, r8)
            m45 r0 = defpackage.m45.E
            if (r1 != r0) goto L5d
            return r0
        L5d:
            iki r1 = (defpackage.iki) r1
            com.anthropic.claude.api.result.ApiResult r0 = r1.a()
            int r13 = r1.b()
            boolean r1 = r0 instanceof defpackage.of0
            if (r1 == 0) goto L77
            xji r1 = new xji
            of0 r0 = (defpackage.of0) r0
            java.lang.Object r0 = r0.b
            com.anthropic.claude.api.chat.MessageFile r0 = (com.anthropic.claude.api.chat.MessageFile) r0
            r1.<init>(r0)
            return r1
        L77:
            boolean r1 = r0 instanceof defpackage.nf0
            if (r1 == 0) goto L92
            wji r10 = new wji
            nf0 r0 = (defpackage.nf0) r0
            boolean r12 = defpackage.cmk.q(r0)
            vt6 r14 = com.anthropic.claude.ui.components.error.a.b(r0)
            r16 = 0
            r17 = 48
            h21 r11 = defpackage.h21.F
            r15 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            return r10
        L92:
            defpackage.mr9.b()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.input.files.a.o(com.anthropic.claude.chat.input.files.a, java.lang.String, tw2, com.anthropic.claude.analytics.events.ChatEvents$UploadSource, bz7, vp4):java.lang.Object");
    }

    public static final Object p(a aVar, String str, String str2, tw2 tw2Var, ChatEvents$UploadSource chatEvents$UploadSource, bz7 bz7Var, zo zoVar) {
        i iVar = aVar.j;
        tie tieVarA = tw2Var.b().a();
        String strB = tw2Var.b().b();
        String str3 = tw2Var.b().c().a;
        koi koiVar = aVar.k;
        return iVar.a(tieVarA, new FileUploadWorker.Args(str, strB, str3, str2, koiVar.d, koiVar.e, chatEvents$UploadSource, tw2Var.a(), bz7Var != null, 0L, (String) null, 1536, (mq5) null), bz7Var == null ? new it2(2) : bz7Var, zoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.yw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r25, java.lang.String r26, com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource r27, com.anthropic.claude.analytics.events.ScreenSource r28, defpackage.pz7 r29, java.lang.String r30, defpackage.zy7 r31, defpackage.vp4 r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.input.files.a.a(android.net.Uri, java.lang.String, com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource, com.anthropic.claude.analytics.events.ScreenSource, pz7, java.lang.String, zy7, vp4):java.lang.Object");
    }

    @Override // defpackage.yw2
    public final void b() {
        b54.w0(new it2(3), this.l);
    }

    @Override // defpackage.yw2
    public final boolean c() {
        return ((Boolean) this.p.getValue()).booleanValue();
    }

    @Override // defpackage.yw2
    public final void d(List list, List list2) {
        Object nw2Var;
        list.getClass();
        list2.getClass();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            kdg kdgVar = this.l;
            if (!zHasNext) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    MessageAttachment messageAttachment = (MessageAttachment) it2.next();
                    UUID uuidRandomUUID = UUID.randomUUID();
                    uuidRandomUUID.getClass();
                    kdgVar.add(new jw2(uuidRandomUUID, messageAttachment));
                }
                return;
            }
            MessageFile messageFile = (MessageFile) it.next();
            UUID uuidFromString = UUID.fromString(messageFile.mo236getFile_uuidExWXDbg());
            if (messageFile instanceof MessageImageFile) {
                uuidFromString.getClass();
                nw2Var = new qw2(uuidFromString, (MessageImageFile) messageFile);
            } else if (messageFile instanceof MessageDocumentFile) {
                uuidFromString.getClass();
                nw2Var = new mw2(uuidFromString, (MessageDocumentFile) messageFile);
            } else if (messageFile instanceof MessageBlobFile) {
                uuidFromString.getClass();
                nw2Var = new lw2(uuidFromString, (MessageBlobFile) messageFile);
            } else if (!(messageFile instanceof MessageUnknownFile)) {
                mr9.b();
                return;
            } else {
                uuidFromString.getClass();
                nw2Var = new nw2(uuidFromString, (MessageUnknownFile) messageFile);
            }
            kdgVar.add(nw2Var);
        }
    }

    @Override // defpackage.yw2
    public final boolean e() {
        return ((Boolean) this.o.getValue()).booleanValue();
    }

    @Override // defpackage.yw2
    public final void f(String str, ww2 ww2Var) {
        b54.w0(new v0(23, ww2Var), this.l);
        tp4 tp4Var = null;
        if (ww2Var instanceof sw2) {
            lf9 lf9Var = (lf9) this.n.remove(ww2Var.j());
            if (lf9Var != null) {
                lf9Var.d(null);
                return;
            }
            return;
        }
        if (!(ww2Var instanceof uw2)) {
            if (ww2Var instanceof jw2) {
                return;
            }
            mr9.b();
        } else if (this.g.f(str)) {
            gb9.D(this.i, null, null, new pb2(this, str, ((uw2) ww2Var).f(), tp4Var, 10), 3);
        }
    }

    @Override // defpackage.yw2
    public final Object g(String str, sw2 sw2Var, tw2 tw2Var, ChatEvents$UploadSource chatEvents$UploadSource, pz7 pz7Var, xzg xzgVar) {
        return sw2Var.e() ? iei.a : q(sw2Var, str, tw2Var, chatEvents$UploadSource, pz7Var, xzgVar);
    }

    @Override // defpackage.yw2
    public final List getFiles() {
        return this.m;
    }

    @Override // defpackage.yw2
    public final void h() {
        this.l.clear();
    }

    @Override // defpackage.yw2
    public final void i(ChatEvents$AddAttachment chatEvents$AddAttachment, boolean z, String str) {
        this.c.e(chatEvents$AddAttachment, ChatEvents$AddAttachment.Companion.serializer());
        s(z, chatEvents$AddAttachment, h21.I, str, ChatEvents$UploadSource.INITIAL_UPLOAD, 0, null, null);
    }

    @Override // defpackage.yw2
    public final boolean k(String str) {
        return this.g.f(str);
    }

    public final Object q(sw2 sw2Var, String str, tw2 tw2Var, ChatEvents$UploadSource chatEvents$UploadSource, pz7 pz7Var, vp4 vp4Var) {
        sw2Var.h(null);
        sw2Var.b(true);
        sw2Var.c(null);
        v0 v0Var = this.g.j.o(UploadConfig.DETERMINATE_PROGRESS_GATE) ? new v0(22, sw2Var) : null;
        String string = sw2Var.j().toString();
        string.getClass();
        fkg fkgVarD = gb9.D(this.i, null, null, new zo(this, string, str, tw2Var, chatEvents$UploadSource, v0Var, sw2Var, pz7Var, (tp4) null), 3);
        this.n.put(sw2Var.j(), fkgVarD);
        return fkgVarD.n(vp4Var);
    }

    public final void r(sw2 sw2Var, ChatEvents$AddAttachment chatEvents$AddAttachment, String str, h21 h21Var) {
        sw2Var.b(false);
        sw2Var.h(vw2.E);
        s(sw2Var instanceof rw2, chatEvents$AddAttachment, h21Var, str, ChatEvents$UploadSource.INITIAL_UPLOAD, 0, null, null);
    }

    public final void s(boolean z, ChatEvents$AddAttachment chatEvents$AddAttachment, h21 h21Var, String str, ChatEvents$UploadSource chatEvents$UploadSource, int i, Integer num, Integer num2) {
        boolean zF = this.g.f(str);
        boolean z2 = !this.h.b();
        qi3 qi3Var = this.c;
        if (z) {
            qi3Var.e(new ChatEvents$AddImageFailed(chatEvents$AddAttachment.getOrganization_uuid(), chatEvents$AddAttachment.getConversation_uuid(), chatEvents$AddAttachment.getUti(), chatEvents$AddAttachment.getSource(), h21Var.b(), chatEvents$AddAttachment.getScreen_source(), Boolean.valueOf(zF), Integer.valueOf(i), chatEvents$UploadSource, Boolean.valueOf(z2), num), ChatEvents$AddImageFailed.Companion.serializer());
            return;
        }
        qi3Var.e(new ChatEvents$AddFileFailed(chatEvents$AddAttachment.getOrganization_uuid(), chatEvents$AddAttachment.getConversation_uuid(), chatEvents$AddAttachment.getUti(), chatEvents$AddAttachment.getSource(), chatEvents$AddAttachment.getScreen_source(), Boolean.valueOf(zF), Integer.valueOf(i), chatEvents$UploadSource, h21Var.a(), Boolean.valueOf(z2), num, num2), ChatEvents$AddFileFailed.Companion.serializer());
    }
}
