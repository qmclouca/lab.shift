import { CollectionPost } from "./CollectionPost";
import { Doctor } from "./Doctor";
import { Patient } from "./Patient";

export type ServiceOrder = {
    id: number;
    date: string;
    patient: Patient[];
    healthInsurance: string;
    collectionPost: CollectionPost[];
    doctor: Doctor[];   
}