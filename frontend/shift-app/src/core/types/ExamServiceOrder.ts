import { Exam } from "./Exam";
import { ServiceOrder } from "./ServiceOrder";

export type ExamServiceOrder = {
    id: number;
    serviceOrder: ServiceOrder[];
    exam: Exam[];
    price: number;    
}