package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class u52 extends xn5 {
    public final /* synthetic */ int f;

    public /* synthetic */ u52(int i) {
        this.f = i;
    }

    @Override // defpackage.xn5
    public final void U(tze tzeVar, Object obj) {
        switch (this.f) {
            case 0:
                s52 s52Var = (s52) obj;
                tzeVar.getClass();
                s52Var.getClass();
                tzeVar.N(1, s52Var.a);
                Date date = s52Var.b;
                date.getClass();
                tzeVar.o(2, date.getTime());
                tzeVar.N(3, s52Var.c);
                break;
            case 1:
                g62 g62Var = (g62) obj;
                tzeVar.getClass();
                g62Var.getClass();
                tzeVar.N(1, g62Var.c());
                Date dateB = g62Var.b();
                dateB.getClass();
                tzeVar.o(2, dateB.getTime());
                tzeVar.N(3, g62Var.a());
                break;
            case 2:
                at2 at2Var = (at2) obj;
                tzeVar.getClass();
                at2Var.getClass();
                tzeVar.N(1, vz8.F(at2Var.a));
                tzeVar.N(2, at2Var.b);
                break;
            case 3:
                rbd rbdVar = (rbd) obj;
                tzeVar.getClass();
                rbdVar.getClass();
                tzeVar.N(1, rbdVar.a);
                tzeVar.o(2, rbdVar.b.longValue());
                break;
            case 4:
                jmd jmdVar = (jmd) obj;
                tzeVar.getClass();
                jmdVar.getClass();
                tzeVar.N(1, imd.a(jmdVar.b()));
                tzeVar.N(2, jmdVar.a());
                break;
            case 5:
                l1h l1hVar = (l1h) obj;
                tzeVar.getClass();
                l1hVar.getClass();
                tzeVar.N(1, l1hVar.a);
                tzeVar.o(2, l1hVar.a());
                tzeVar.o(3, l1hVar.c);
                break;
            case 6:
                kgj kgjVar = (kgj) obj;
                tzeVar.getClass();
                kgjVar.getClass();
                tzeVar.N(1, kgjVar.b());
                pf5 pf5Var = pf5.b;
                tzeVar.p(rvk.o(kgjVar.a()), 2);
                break;
            default:
                tgj tgjVar = (tgj) obj;
                tzeVar.getClass();
                tgjVar.getClass();
                tzeVar.N(1, tgjVar.a);
                tzeVar.o(2, cmk.w(tgjVar.b));
                tzeVar.N(3, tgjVar.c);
                tzeVar.N(4, tgjVar.d);
                pf5 pf5Var2 = pf5.b;
                tzeVar.p(rvk.o(tgjVar.e), 5);
                tzeVar.p(rvk.o(tgjVar.f), 6);
                tzeVar.o(7, tgjVar.g);
                tzeVar.o(8, tgjVar.h);
                tzeVar.o(9, tgjVar.i);
                tzeVar.o(10, tgjVar.k);
                tzeVar.o(11, cmk.g(tgjVar.l));
                tzeVar.o(12, tgjVar.m);
                tzeVar.o(13, tgjVar.n);
                tzeVar.o(14, tgjVar.o);
                tzeVar.o(15, tgjVar.p);
                tzeVar.o(16, tgjVar.q ? 1L : 0L);
                tzeVar.o(17, cmk.u(tgjVar.r));
                tzeVar.o(18, tgjVar.f());
                tzeVar.o(19, tgjVar.c());
                tzeVar.o(20, tgjVar.d());
                tzeVar.o(21, tgjVar.e());
                tzeVar.o(22, tgjVar.g());
                String strH = tgjVar.h();
                if (strH == null) {
                    tzeVar.q(23);
                } else {
                    tzeVar.N(23, strH);
                }
                Boolean boolB = tgjVar.b();
                if ((boolB != null ? Integer.valueOf(boolB.booleanValue() ? 1 : 0) : null) == null) {
                    tzeVar.q(24);
                } else {
                    tzeVar.o(24, r4.intValue());
                }
                ql4 ql4Var = tgjVar.j;
                tzeVar.o(25, cmk.t(ql4Var.f()));
                tzeVar.p(cmk.j(ql4Var.e()), 26);
                tzeVar.o(27, ql4Var.i() ? 1L : 0L);
                tzeVar.o(28, ql4Var.j() ? 1L : 0L);
                tzeVar.o(29, ql4Var.h() ? 1L : 0L);
                tzeVar.o(30, ql4Var.k() ? 1L : 0L);
                tzeVar.o(31, ql4Var.b());
                tzeVar.o(32, ql4Var.a());
                tzeVar.p(cmk.v(ql4Var.c()), 33);
                break;
        }
    }

    @Override // defpackage.xn5
    public final String X() {
        switch (this.f) {
            case 0:
                return "INSERT INTO `cachedConversations` (`uuid`,`updated_at`,`conversation_json`) VALUES (?,?,?)";
            case 1:
                return "INSERT INTO `cachedProjects` (`uuid`,`updated_at`,`project_json`) VALUES (?,?,?)";
            case 2:
                return "INSERT INTO `chatIdListEntries` (`source`,`chat_uuid`) VALUES (?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 4:
                return "INSERT INTO `projectIdListEntries` (`source`,`project_uuid`) VALUES (?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public /* synthetic */ u52(int i, Object obj) {
        this.f = i;
    }
}
