import React, { useState, useEffect } from 'react';
import axios from 'axios';


const ManterCor = () => {
    const [cores, setCores] = useState([]);

    const getCores = async () => {
        await axios.get('/api/cores').then((response) => {
            console.log(response.data);
            setCores(response.data);
        });
    }

    const deleteCor = async (id) => {
        await axios.delete(`/api/cores/${id}`);
        getCores();
    }

    useEffect(() => {
        getCores();
    },[]);
    //getCores();

    const dados = cores.map( c => {
        return <tr key={c.id}>
            <td>{c.id}</td>
            <td>{c.nome}</td>
            <td><button onClick={() => deleteCor(c.id)}>Excluir</button></td>
        </tr>
    });

    
    return (
        <div>
            <h1>Manter Cor!</h1>
            <button onClick={() => getCores()}>Refresh</button>
            <table>
                <thead>
                <tr>
                    <td>Id</td>
                    <td>Nome</td>
                    <td>Ações</td>
                </tr>
                </thead>
                <tbody>                    
                    {dados}
                </tbody>
            </table>
        </div>
    );
}

export default ManterCor;